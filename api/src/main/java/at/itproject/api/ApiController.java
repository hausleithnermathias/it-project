package at.itproject.api;

import at.itproject.core.ApiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/{ip}")
public class ApiController {

    @Autowired
    ApiServiceImpl apiService;

    @GetMapping("status")
    @ResponseBody
    public String printerStatus(@PathVariable String ip) {

        return apiService.getPrinterStatus(ip);
        //apiService.getPrinterStatus(ip);
    }

    @GetMapping("hotend-temperatures")
    @ResponseBody
    public String hotendTemperatures(@PathVariable String ip) {

        return apiService.getHotendTemperatures(ip);
    }

    @GetMapping("hot-time")
    @ResponseBody
    public String timeSpentHot(@PathVariable String ip) {

        return apiService.getTimeSpentHot(ip);
    }

    @GetMapping("material-extruded")
    @ResponseBody
    public String materialExtruded(@PathVariable String ip) {

        return apiService.getMaterialExtruded(ip);
    }

    @GetMapping("printjob-history")
    @ResponseBody
    public String printjobHistory(@PathVariable String ip) {

        return apiService.getPrintJobHistory(ip);
    }

    @GetMapping("printjob-progress")
    @ResponseBody
    public String printjobProgress(@PathVariable String ip) {

        return apiService.getPrintJobProgress(ip);
    }
}
