package com.innolux.serviceribbon;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
*@EnableDiscoveryClient 注解是基于spring-cloud-commons依赖，并且在classpath中实现；
*@EnableEurekaClient    注解是基于spring-cloud-netflix依赖，只能为eureka作用；
*/

/**
 * @author wei.li
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrix
public class ServiceRibbonApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ServiceRibbonApplication.class, args);
        SpringApplication application = new SpringApplication(ServiceRibbonApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
        System.out.println("Service-Ribbon is running!");
    }


    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
