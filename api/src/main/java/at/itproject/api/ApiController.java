package at.itproject.api;

import at.itproject.core.ApiServiceImpl;
import io.swagger.client.ApiException;
import io.swagger.client.api.HistoryApi;
import io.swagger.client.api.PrinterApi;
import io.swagger.client.model.EventHistoryEntry;
import io.swagger.client.model.Head;
import io.swagger.client.model.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/{ip}")
public class ApiController {

    @Autowired
    ApiServiceImpl apiService;

    @GetMapping("status")
    @ResponseBody
    public String printerStatus(@PathVariable String ip) {

        return apiService.getPrinterStatus(ip);
    }

    @GetMapping("hotend-temperatures")
    @ResponseBody
    public String hotendTemperatures(@PathVariable String ip) {

        return apiService.getHotendTemperatures(ip);
    }
}
