package at.itproject.core;

import io.swagger.client.ApiException;
import io.swagger.client.api.HistoryApi;
import io.swagger.client.api.MaterialsApi;
import io.swagger.client.api.PrintJobApi;
import io.swagger.client.api.PrinterApi;
import io.swagger.client.model.Head;
import io.swagger.client.model.PrintJobHistory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApiServiceImpl {

    private Calendar calendar = Calendar.getInstance();
    String[] strDays = new String[]{"Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"};
    String[] strMonths = new String[]{"January", "February", "March",
            "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    //@Value("${spring.data.rest.base-path}")
    private String basepath = "http://";

    private int i = 1;

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
                            lineChartDto.getTag_set().add("extruder="+ i++);
                            lineChartDto.getTag_set().add("nozzleType="+extruder.getHotend().getId().replace(" ","_"));
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
                            lineChartDto.getTag_set().add("extruder="+ i++);
                            lineChartDto.getTag_set().add("nozzleType="+extruder.getHotend().getId().replace(" ","_"));                            lineChartDto.getTag_set().add("weekday="+strDays[calendar.get(Calendar.DAY_OF_WEEK)-1]);
                            lineChartDto.getTag_set().add("month="+strMonths[calendar.get(Calendar.MONTH)]);
                            lineChartDto.getTag_set().add("year="+calendar.get(Calendar.YEAR));
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
                            lineChartDto.getTag_set().add("extruder="+ i++);
                            lineChartDto.getTag_set().add("nozzleType="+extruder.getHotend().getId().replace(" ","_"));                            lineChartDto.getTag_set().add("weekday="+strDays[calendar.get(Calendar.DAY_OF_WEEK)-1]);
                            lineChartDto.getTag_set().add("month="+strMonths[calendar.get(Calendar.MONTH)]);
                            lineChartDto.getTag_set().add("year="+calendar.get(Calendar.YEAR));
                            lineChartDto.getField_set().add("material-extruded="+extruder.getHotend().getStatistics().getMaterialExtruded());
                            measurements.add(lineChartDto);
                        })
                );

                return measurements.stream().map(Object::toString).collect(Collectors.joining("\n"));
            }
        }
        return null;
    }

    public String getMaterialRemaining(String ip) {
        PrinterApi printerApi = new PrinterApi();
        String id = ip.split("\\.")[3];
        printerApi.getApiClient().setBasePath(basepath + ip + "/api/v1");

        MaterialsApi materialsApi = new MaterialsApi();
        List<Head> heads;
        List<LineChartDto> measurements = new ArrayList<>();

        if(pingHost(ip,500)){
            heads=getHead(printerApi);
            if(heads != null){
                heads.forEach(head->head.getExtruders().forEach(extruder->{
                            LineChartDto lineChartDto=new LineChartDto();
                            lineChartDto.setMeasurement("material_remaining");
                            lineChartDto.getTag_set().add("printer="+id);
                            lineChartDto.getTag_set().add("hotend="+extruder.getHotend().getId().replace(" ","_"));
                            lineChartDto.getTag_set().add("weekday="+strDays[calendar.get(Calendar.DAY_OF_WEEK)-1]);
                            lineChartDto.getTag_set().add("month="+strMonths[calendar.get(Calendar.MONTH)]);
                            lineChartDto.getTag_set().add("year="+calendar.get(Calendar.YEAR));
                            lineChartDto.getTag_set().add("guid="+extruder.getActiveMaterial().getGUID());
                            lineChartDto.getField_set().add("material-remaining="+extruder.getActiveMaterial().getLengthRemaining().intValue()*(-1));
                            if(extruder.getActiveMaterial().getGUID().compareTo("")!=0 || (extruder.getActiveMaterial().getLengthRemaining().intValue()!=-1)) {
                                measurements.add(lineChartDto);
                            }
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

        if(pingHost(ip,500)){
            try {
                PrintJobHistory history=historyApi.historyPrintJobsGet(BigDecimal.valueOf(0),BigDecimal.valueOf(1)).iterator().next();
                String uuid=history.getUuid();
                String result=history.getResult().toString();
                return "printjob_history,result="+result+",printer="+id+",weekday="+strDays[calendar.get(Calendar.DAY_OF_WEEK)-1]+",month="+strMonths[calendar.get(Calendar.MONTH)]+",year="+calendar.get(Calendar.YEAR)+" uuid=\""+uuid+"\"";
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    public String getPrintJobProgress(String ip) {
        String id=ip.split("\\.")[3];
        PrintJobApi printJobApi=new PrintJobApi();
        PrinterApi printerApi=new PrinterApi();
        printJobApi.getApiClient().setBasePath(basepath+ip+"/api/v1");
        printerApi.getApiClient().setBasePath(basepath + ip + "/api/v1");
        long progress;
        String name;

        if(pingHost(ip,500)){
            try {
                if(printerApi.printerStatusGet().compareTo("printing")==0) {
                    progress=Math.round(printJobApi.printJobProgressGet().doubleValue()*100);
                    name=printJobApi.printJobNameGet().replace(" ","_");
                    if(name.compareTo("")!=0){
                        return "printjob_progress,printer="+id+",jobname="+name+" progress=" + progress;
                    }
                }
            } catch (Exception e) {
                return null;
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
