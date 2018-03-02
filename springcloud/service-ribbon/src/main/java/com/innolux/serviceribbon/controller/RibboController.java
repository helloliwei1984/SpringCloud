package com.innolux.serviceribbon.controller;

import com.innolux.serviceribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
* @RequestParam 和 @PathVariable 注解是用于从request中接收请求的，两个都可以接收参数，关键点不同的是@RequestParam 是从request里面拿取值，而 @PathVariable是从一个URI模板里面来填充
*@PathParam 和spring的pathVariable是一样的，也是基于模板的，但是这个是jboss包下面的一个实现，上面的是spring的一个实现，都要导包
*
*/

/**
 * @Description:
 * @Author liwei
 * @create 2018-02-06 15:46
 */
@RestController
public class RibboController {

    @Autowired
    public RibbonService ribbonService;

    @GetMapping(value = "/hello")
    public  String  hello(){
        return  ribbonService.ribbonService();
    }
}
