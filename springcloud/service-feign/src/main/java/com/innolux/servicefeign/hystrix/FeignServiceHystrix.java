package com.innolux.servicefeign.hystrix;

import com.innolux.servicefeign.service.FeignService;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author liwei
 * @create 2018-02-07 17:25
 */
@Component
public class FeignServiceHystrix implements FeignService {

    @Override
    public String feignService() {
        return "Get some error!";
    }
}
