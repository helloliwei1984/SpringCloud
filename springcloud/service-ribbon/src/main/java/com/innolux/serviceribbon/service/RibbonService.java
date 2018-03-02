package com.innolux.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author liwei
 * @create 2018-02-06 15:50
 */
@Service
public class RibbonService {

    @Autowired
    public RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "helloError")
    public String ribbonService() {  return restTemplate.getForObject("http://service-eureka/client", String.class); }

    public String helloError(){
        return "Get some error!";
    }
}
