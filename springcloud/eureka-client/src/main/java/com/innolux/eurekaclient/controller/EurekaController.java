package com.innolux.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wei.li
 */
@RestController
public class EurekaController {

    @Value("${server.port}")
    private  String port;


    @GetMapping("/client")
    public  String eurekaClient(){
        return "I am EurekaClient! "+"port:"+port;
    }
}
