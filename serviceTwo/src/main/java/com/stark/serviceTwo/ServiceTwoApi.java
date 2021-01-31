package com.stark.serviceTwo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getHai")
public class ServiceTwoApi {
    @GetMapping(value="hai",produces = "text/plain")
    public String gethai(){
        return "Hi";
    }
}
