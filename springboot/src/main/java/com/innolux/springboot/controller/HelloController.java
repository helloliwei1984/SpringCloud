package com.innolux.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author liwei
 * @create 2018-01-31 14:29
 */
@RestController
public class HelloController {

    @GetMapping(value = {"/hello","/hi"})
    public String say(){
        return "hi you!!!";
    }
}
