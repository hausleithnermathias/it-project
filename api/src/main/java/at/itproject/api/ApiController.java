package at.itproject.api;

import io.swagger.client.ApiException;
import io.swagger.client.api.HistoryApi;
import io.swagger.client.api.PrinterApi;
import io.swagger.client.model.EventHistoryEntry;
import io.swagger.client.model.PrintJobHistory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class ApiController {

    @GetMapping
    public String test() {

        HistoryApi historyApi = new HistoryApi();
        PrinterApi printerApi = new PrinterApi();
        printerApi.getApiClient().setBasePath("");
        String string = null;
        try {
           List<EventHistoryEntry> list = historyApi.historyEventsGet(null,null, null);
           string = printerApi.printerStatusGet();
           list.forEach(l -> System.out.println(l.getMessage()));
        } catch (ApiException e) {
            e.printStackTrace();
        }


        return string;
    }

}
