package at.itproject.api;

import at.itproject.core.ApiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/{ip}")
public class ApiController {

    //@Autowired
    //ApiServiceImpl apiService;

    @GetMapping("status")
    @ResponseBody
    public String printerStatus(@PathVariable String ip) {
        ApiServiceImpl apiService = new ApiServiceImpl();
        return apiService.getPrinterStatus(ip);
        //apiService.getPrinterStatus(ip);
    }

    @GetMapping("hotend-temperatures")
    @ResponseBody
    public String hotendTemperatures(@PathVariable String ip) {
        ApiServiceImpl apiService = new ApiServiceImpl();
        return apiService.getHotendTemperatures(ip);
    }

    @GetMapping("hot-time")
    @ResponseBody
    public String timeSpentHot(@PathVariable String ip) {
        ApiServiceImpl apiService = new ApiServiceImpl();
        return apiService.getTimeSpentHot(ip);
    }

    @GetMapping("material-extruded")
    @ResponseBody
    public String materialExtruded(@PathVariable String ip) {
        ApiServiceImpl apiService = new ApiServiceImpl();
        return apiService.getMaterialExtruded(ip);
    }

    @GetMapping("printjob-history")
    @ResponseBody
    public String printjobHistory(@PathVariable String ip) {
        ApiServiceImpl apiService = new ApiServiceImpl();
        return apiService.getPrintJobHistory(ip);
    }

    @GetMapping("printjob-progress")
    @ResponseBody
    public String printjobProgress(@PathVariable String ip) {
        ApiServiceImpl apiService = new ApiServiceImpl();
        return apiService.getPrintJobProgress(ip);
    }

    @GetMapping("material-remaining")
    @ResponseBody
    public String materialRemaining(@PathVariable String ip) {
        ApiServiceImpl apiService = new ApiServiceImpl();
        return apiService.getMaterialRemaining(ip);
    }
}
