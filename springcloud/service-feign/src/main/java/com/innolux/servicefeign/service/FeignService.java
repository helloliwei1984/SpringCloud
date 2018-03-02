package com.innolux.servicefeign.service;

import com.innolux.servicefeign.hystrix.FeignServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @Author liwei
 * @create 2018-02-07 10:06
 */
@FeignClient(value = "service-eureka", fallback = FeignServiceHystrix.class)
public interface FeignService {
    @GetMapping("/client")
    String feignService();
}
