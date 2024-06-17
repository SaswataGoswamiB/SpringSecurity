package Com.Security.sas.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String saywelcome()
    {
        return "Welcome to Spring with Security";
    }
    
}
