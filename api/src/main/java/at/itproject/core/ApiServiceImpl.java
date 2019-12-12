package at.itproject.core;

import io.swagger.client.ApiException;
import io.swagger.client.api.HistoryApi;
import io.swagger.client.api.PrinterApi;
import io.swagger.client.model.Head;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApiServiceImpl {

    private PrinterApi printerApi = new PrinterApi();
    private HistoryApi historyApi = new HistoryApi();

    private Calendar calendar = Calendar.getInstance();
    String[] strDays = new String[]{"Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"};
    String[] strMonths = new String[]{"January", "February", "March",
            "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    @Value("${spring.data.rest.base-path}")
    private String basepath;

    /*
    public String getPrinterStatus(String ip) {
        String id = ip.split("\\.")[3];

        printerApi.getApiClient().setBasePath(basepath + ip + "/api/v1");
        String status;

        try {
            status = printerApi.printerStatusGet();

        } catch (ApiException e) {
            status = "unknown";
        }

        return "printer_status,printer=" + id + ",weekday=" + strDays[calendar.get(Calendar.DAY_OF_WEEK) - 1] + ",month=" + strMonths[calendar.get(Calendar.MONTH)] + ",year=" + calendar.get(Calendar.YEAR) + " status=\"" + status + "\"";
    }
     */

    public String getPrinterStatus(String ip) {
      //  String id = ip.split("\\.")[3];

        List<LineChartDto> measurements = new ArrayList<>();
        for(int i=31; i<=33; i++) {
            printerApi.getApiClient().setBasePath(basepath + "10.6.0" + i + "/api/v1");
            String status;
            try {
                status = printerApi.printerStatusGet();
            } catch (ApiException e) {
                status = "unknown";
            }
            LineChartDto lineChartDto = new LineChartDto();
            lineChartDto.setMeasurement("printer_status");
            lineChartDto.getTag_set().add("printer=" + i);
            lineChartDto.getTag_set().add("weekday=" + strDays[calendar.get(Calendar.DAY_OF_WEEK) - 1]);
            lineChartDto.getTag_set().add("month=" + strMonths[calendar.get(Calendar.MONTH)]);
            lineChartDto.getTag_set().add("year=" + calendar.get(Calendar.YEAR));
            lineChartDto.getField_set().add("status=" + status);
            measurements.add(lineChartDto);
        }

        return measurements.stream().map(Object::toString).collect(Collectors.joining("\n"));
        //System.out.println(measurements.stream().map(Object::toString).collect(Collectors.joining("\n")));
    }

    public String getHotendTemperatures(String ip) {

        String id = ip.split("\\.")[3];

        printerApi.getApiClient().setBasePath(basepath + ip + "/api/v1");
        printerApi.getApiClient().setConnectTimeout(5000);

        List<Head> heads = getHead();
        List<LineChartDto> measurements = new ArrayList<>();

        if (heads != null) {
            heads.forEach(head -> head.getExtruders().forEach(extruder -> {
                        LineChartDto lineChartDto = new LineChartDto();
                        lineChartDto.setMeasurement("temperature_hotend");
                        lineChartDto.getTag_set().add("printer=" + id);
                        lineChartDto.getTag_set().add("hotend=" + extruder.getHotend().getId().replace(" ", "_"));
                        lineChartDto.getTag_set().add("weekday=" + strDays[calendar.get(Calendar.DAY_OF_WEEK) - 1]);
                        lineChartDto.getTag_set().add("month=" + strMonths[calendar.get(Calendar.MONTH)]);
                        lineChartDto.getTag_set().add("year=" + calendar.get(Calendar.YEAR));
                        lineChartDto.getField_set().add("temperature=" + extruder.getHotend().getTemperature().getCurrent().toString());
                        measurements.add(lineChartDto);
                    })
            );

            return measurements.stream().map(Object::toString).collect(Collectors.joining("\n"));
        }
        else {
            LineChartDto lineChartDto = new LineChartDto();
            lineChartDto.setMeasurement("temperature_hotend");
            lineChartDto.getTag_set().add("printer=" + id);
            lineChartDto.getTag_set().add("hotend=" + "test");
            lineChartDto.getTag_set().add("weekday=" + strDays[calendar.get(Calendar.DAY_OF_WEEK) - 1]);
            lineChartDto.getTag_set().add("month=" + strMonths[calendar.get(Calendar.MONTH)]);
            lineChartDto.getTag_set().add("year=" + calendar.get(Calendar.YEAR));
            lineChartDto.getField_set().add("temperature=" + -1);

            return lineChartDto.toString();
        }

    }

    public String getTimeSpentHot(String ip) {

        String id = ip.split("\\.")[3];
        printerApi.getApiClient().setBasePath(basepath + ip + "/api/v1");

        List<Head> heads = getHead();
        List<LineChartDto> measurements = new ArrayList<>();

        heads.forEach(head -> head.getExtruders().forEach(extruder -> {
                    LineChartDto lineChartDto = new LineChartDto();
                    lineChartDto.setMeasurement("temperature_hotend");
                    lineChartDto.getTag_set().add("printer=" + id);
                    lineChartDto.getTag_set().add("hotend=" + extruder.getHotend().getId().replace(" ", "_"));
                    lineChartDto.getField_set().add("time-spent-hot=" + extruder.getHotend().getStatistics().getTimeSpentHot());
                    measurements.add(lineChartDto);
                })
        );

        return measurements.stream().map(Object::toString).collect(Collectors.joining("\n"));
    }

    public String getMaterialExtruded(String ip) {

        String id = ip.split("\\.")[3];
        printerApi.getApiClient().setBasePath(basepath + ip + "/api/v1");

        List<Head> heads = getHead();
        List<LineChartDto> measurements = new ArrayList<>();

        heads.forEach(head -> head.getExtruders().forEach(extruder -> {
                    LineChartDto lineChartDto = new LineChartDto();
                    lineChartDto.setMeasurement("temperature_hotend");
                    lineChartDto.getTag_set().add("printer=" + id);
                    lineChartDto.getTag_set().add("hotend=" + extruder.getHotend().getId().replace(" ", "_"));
                    lineChartDto.getField_set().add("material-extruded=" + extruder.getHotend().getStatistics().getMaterialExtruded());
                    measurements.add(lineChartDto);
                })
        );

        return measurements.stream().map(Object::toString).collect(Collectors.joining("\n"));
    }

    public String getPrintJobHistory(String ip) {

        String id = ip.split("\\.")[3];
        historyApi.getApiClient().setBasePath(basepath + ip + "/api/v1");

        return null;
    }

    private List<Head> getHead() {

        try {
            return printerApi.printerHeadsGet();
        } catch (ApiException e) {
            return null;
        }
    }
}
