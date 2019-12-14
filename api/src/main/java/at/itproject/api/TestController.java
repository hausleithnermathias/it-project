package at.itproject.api;


import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @RequestMapping(value="", consumes= "text/plain", method= RequestMethod.POST)
    public void addReservation(@RequestBody String reservation) throws IOException {
        try {
            System.out.println(reservation);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}
