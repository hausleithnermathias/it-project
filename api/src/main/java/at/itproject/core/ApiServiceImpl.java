package at.itproject.core;

import io.swagger.client.ApiException;
import io.swagger.client.api.PrinterApi;
import io.swagger.client.model.Head;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service
public class ApiServiceImpl {

    private PrinterApi printerApi = new PrinterApi();
    private Calendar calendar = Calendar.getInstance();
    @Value("${spring.data.rest.base-path}")
    private String basepath;

    public String getPrinterStatus(String ip){
        String id = ip.split("\\.")[3];

        printerApi.getApiClient().setBasePath(basepath + ip + "/api/v1");
        String status;

        try {
            status = printerApi.printerStatusGet();

        } catch (ApiException e) {
            status = "unknown";
        }

        return "printer_status,printer=" + id + ",weekday=" + calendar.get(Calendar.DAY_OF_WEEK) + ",month=" + calendar.get(Calendar.MONTH) + ",year=" + calendar.get(Calendar.YEAR) + " status=\"" + status + "\"";
    }

    public String getHotendTemperatures(String ip){
        String id = ip.split("\\.")[3];

        printerApi.getApiClient().setBasePath(basepath + ip + "/api/v1");

        List<Head> heads;
        List<LineChartDto> measurements = new ArrayList<>();

        try{
            heads = printerApi.printerHeadsGet();

        } catch (ApiException e) {
            return null;
        }

        heads.forEach(head -> head.getExtruders().forEach(extruder -> {
            LineChartDto lineChartDto = new LineChartDto();
            lineChartDto.setMeasurement("temperature_hotend");
            lineChartDto.getTag_set().add(id);
            lineChartDto.getTag_set().add(extruder.getHotend().getId());


        })
        );

        return "printer_status,printer=" + id + ",weekday=" + calendar.get(Calendar.DAY_OF_WEEK) + ",month=" + calendar.get(Calendar.MONTH) + ",year=" + calendar.get(Calendar.YEAR) + " status ";
    }
}
