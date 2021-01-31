package com.stark.serviceThree;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getTheWelcome")
public class ServiceThreeApi {
    @GetMapping(value="/message",produces = "text/plain")
    public String getWelcomeMessage(){
        return "welcome to Microservice world";
    }
}
