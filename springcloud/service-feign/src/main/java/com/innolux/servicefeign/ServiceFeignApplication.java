package com.innolux.servicefeign;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author wei.li
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@EnableHystrixDashboard
public class ServiceFeignApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ServiceFeignApplication.class, args);
		SpringApplication application = new SpringApplication(ServiceFeignApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
		System.out.println("Service-Feign is running!");
	}
}
