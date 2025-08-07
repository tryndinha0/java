package dio.my_first_web_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class WelcomeController {
    @GetMapping("/usersHello")
    public String welcome(){
        return  "Welcome to my string boot api";
    }
    
    
}
