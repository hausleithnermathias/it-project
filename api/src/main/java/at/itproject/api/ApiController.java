package at.itproject.api;

import io.swagger.client.ApiException;
import io.swagger.client.api.HistoryApi;
import io.swagger.client.api.PrinterApi;
import io.swagger.client.model.EventHistoryEntry;
import io.swagger.client.model.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/{id}")
public class ApiController {

    @Value("${spring.data.rest.base-path}")
    String basepath;

    PrinterApi printerApi = new PrinterApi();

    @GetMapping()
    @ResponseBody
    public String test() {

        HistoryApi historyApi = new HistoryApi();
        String string = null;
        try {
           List<EventHistoryEntry> list = historyApi.historyEventsGet(null,null, null);
           list.forEach(l -> System.out.println(l));
        } catch (ApiException e) {
            e.printStackTrace();
        }


        return string;
    }

    @GetMapping("printstatus")
    @ResponseBody
    public String printerStatus(@PathVariable String id) {

        printerApi.getApiClient().setBasePath(basepath +id + "/api/v1");

        try {
            return printerApi.printerStatusGet();
        } catch (ApiException e) {
            return "offline";
        }

    }

}
