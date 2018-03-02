package com.innolux.servicefeign.controller;

import com.innolux.servicefeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author liwei
 * @create 2018-02-07 10:05
 */
@RestController
public class FeignController {

    @Autowired
    public FeignService feignService;


    @GetMapping(value = "/hello")
    public  String  hello(){
        return  feignService.feignService();
    }
}
