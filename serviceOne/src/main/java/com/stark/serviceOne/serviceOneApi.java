package com.stark.serviceOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/home")
public class serviceOneApi {

    @Autowired
    private RestTemplate rt;

    @RequestMapping(value="/{userName}",method =GET,produces = "text/plain")
    public String getWelcomeMessage(@PathVariable("userName") String userName){
        String strHai = rt.getForObject("http://servicetwo/getHai/hai",String.class);
        String strName = rt.getForObject("http://servicethree/getTheWelcome/message",String.class);
        return strHai + " " + userName + " " + strName;
    }
}
