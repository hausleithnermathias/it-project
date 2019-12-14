package at.itproject.core;

import io.swagger.client.ApiException;
import io.swagger.client.api.HistoryApi;
import io.swagger.client.api.PrintJobApi;
import io.swagger.client.api.PrinterApi;
import io.swagger.client.model.Head;
import io.swagger.client.model.PrintJobHistory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApiServiceImpl {



    private Calendar calendar = Calendar.getInstance();
    String[] strDays = new String[]{"Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"};
    String[] strMonths = new String[]{"January", "February", "March",
            "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String uuidOld31 = "";
    String uuidOld32 = "";
    String uuidOld33 = "";
    @Value("${spring.data.rest.base-path}")
    private String basepath;

    public static boolean pingHost(String host,int timeout) {
        try{
            InetAddress address = InetAddress.getByName(host);
            boolean reachable = address.isReachable(timeout);
            return reachable;
        } catch (Exception e){
            return false;
        }
    }

    public String getPrinterStatus(String ip) {
        String id = ip.split("\\.")[3];
        PrinterApi printerApi = new PrinterApi();
        printerApi.getApiClient().setBasePath(basepath + ip + "/api/v1");
        String status;

        if(pingHost(ip,500)) {
            try {
                status = printerApi.printerStatusGet();

            } catch (ApiException e) {
                status = "unknown";
            }
        }
        else {
            status = "unknown";
        }
        return "printer_status,printer=" + id + ",weekday=" + strDays[calendar.get(Calendar.DAY_OF_WEEK) - 1] + ",month=" + strMonths[calendar.get(Calendar.MONTH)] + ",year=" + calendar.get(Calendar.YEAR) + " status=\"" + status + "\"";
    }

    public String getHotendTemperatures(String ip) {

        String id=ip.split("\\.")[3];
        PrinterApi printerApi=new PrinterApi();
        printerApi.getApiClient().setBasePath(basepath+ip+"/api/v1");
        //printerApi.getApiClient().setConnectTimeout(5000);
        List<LineChartDto> measurements=new ArrayList<>();
        List<Head> heads;

        if(pingHost(ip,500)){
            heads=getHead(printerApi);
            if(heads != null){
                heads.forEach(head->head.getExtruders().forEach(extruder->{
                            LineChartDto lineChartDto=new LineChartDto();
                            lineChartDto.setMeasurement("temperature_hotend");
                            lineChartDto.getTag_set().add("printer="+id);
                            lineChartDto.getTag_set().add("hotend="+extruder.getHotend().getId().replace(" ","_"));
                            lineChartDto.getTag_set().add("weekday="+strDays[calendar.get(Calendar.DAY_OF_WEEK)-1]);
                            lineChartDto.getTag_set().add("month="+strMonths[calendar.get(Calendar.MONTH)]);
                            lineChartDto.getTag_set().add("year="+calendar.get(Calendar.YEAR));
                            lineChartDto.getField_set().add("temperature="+extruder.getHotend().getTemperature().getCurrent().toString());
                            measurements.add(lineChartDto);
                        })
                );
                return measurements.stream().map(Object::toString).collect(Collectors.joining("\n"));
            }
        }
        return null;
    }

    public String getTimeSpentHot(String ip) {
        PrinterApi printerApi=new PrinterApi();
        String id=ip.split("\\.")[3];
        printerApi.getApiClient().setBasePath(basepath+ip+"/api/v1");

        List<Head> heads;
        List<LineChartDto> measurements=new ArrayList<>();

        if(pingHost(ip,500)){
            heads=getHead(printerApi);
            if(heads != null){

                heads.forEach(head->head.getExtruders().forEach(extruder->{
                            LineChartDto lineChartDto=new LineChartDto();
                            lineChartDto.setMeasurement("time_spent_hot");
                            lineChartDto.getTag_set().add("printer="+id);
                            lineChartDto.getTag_set().add("hotend="+extruder.getHotend().getId().replace(" ","_"));
                            lineChartDto.getField_set().add("time-spent-hot="+extruder.getHotend().getStatistics().getTimeSpentHot());
                            measurements.add(lineChartDto);
                        })
                );

                return measurements.stream().map(Object::toString).collect(Collectors.joining("\n"));
            }
        }
        return null;
    }

    public String getMaterialExtruded(String ip) {
        PrinterApi printerApi = new PrinterApi();
        String id = ip.split("\\.")[3];
        printerApi.getApiClient().setBasePath(basepath + ip + "/api/v1");

        List<Head> heads;
        List<LineChartDto> measurements = new ArrayList<>();

        if(pingHost(ip,500)){
            heads=getHead(printerApi);
            if(heads != null){

                heads.forEach(head->head.getExtruders().forEach(extruder->{
                            LineChartDto lineChartDto=new LineChartDto();
                            lineChartDto.setMeasurement("material_extruded");
                            lineChartDto.getTag_set().add("printer="+id);
                            lineChartDto.getTag_set().add("hotend="+extruder.getHotend().getId().replace(" ","_"));
                            lineChartDto.getField_set().add("material-extruded="+extruder.getHotend().getStatistics().getMaterialExtruded());
                            measurements.add(lineChartDto);
                        })
                );

                return measurements.stream().map(Object::toString).collect(Collectors.joining("\n"));
            }
        }
        return null;
    }

    public String getPrintJobHistory(String ip) {

        String id = ip.split("\\.")[3];
        HistoryApi historyApi = new HistoryApi();
        historyApi.getApiClient().setBasePath(basepath + ip + "/api/v1");
        PrintJobHistory history;
        String result = "";
        String uuidNew = "";

        if(pingHost(ip,500)){
            try {
                history=historyApi.historyPrintJobsGet(BigDecimal.valueOf(0),BigDecimal.valueOf(1)).iterator().next();
                uuidNew=history.getUuid();
                result=history.getResult().toString();
            } catch (Exception e) {
                e.printStackTrace();
            }

            if(id.compareTo("31")==0){
                if(uuidOld31.compareTo(uuidNew) != 0){
                    uuidOld31=uuidNew;
                    return "printjob_history,printer="+id+",weekday="+strDays[calendar.get(Calendar.DAY_OF_WEEK)-1]+",month="+strMonths[calendar.get(Calendar.MONTH)]+",year="+calendar.get(Calendar.YEAR)+" result=\""+result+"\"";
                }
            }

            if(id.compareTo("32")==0){
                if(uuidOld32.compareTo(uuidNew) != 0){
                    uuidOld32=uuidNew;
                    return "printjob_history,printer="+id+",weekday="+strDays[calendar.get(Calendar.DAY_OF_WEEK)-1]+",month="+strMonths[calendar.get(Calendar.MONTH)]+",year="+calendar.get(Calendar.YEAR)+" result=\""+result+"\"";
                }
            }

            if(id.compareTo("33")==0){
                if(uuidOld33.compareTo(uuidNew) != 0){
                    uuidOld33=uuidNew;
                    return "printjob_history,printer="+id+",weekday="+strDays[calendar.get(Calendar.DAY_OF_WEEK)-1]+",month="+strMonths[calendar.get(Calendar.MONTH)]+",year="+calendar.get(Calendar.YEAR)+" result=\""+result+"\"";
                }
            }
        }
        return null;
    }

    // TODO: Exception handling if no job is running
    public String getPrintJobProgress(String ip) {
        String id=ip.split("\\.")[3];
        PrintJobApi printJobApi=new PrintJobApi();
        printJobApi.getApiClient().setBasePath(basepath+ip+"/api/v1");
        long progress = 0;
        String name = "";

        if(pingHost(ip,500)){
            try {
                progress=Math.round(printJobApi.printJobProgressGet().doubleValue()*100);
                name=printJobApi.printJobNameGet();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if(name.compareTo("")!=0){
                return "printjob_progress,printer="+id+",jobname="+name+" progress=" + progress;
            }
        }
        return null;
    }

    private List<Head> getHead(PrinterApi printerApi) {

        try {
            return printerApi.printerHeadsGet();
        } catch (ApiException e) {
            return null;
        }
    }


}
