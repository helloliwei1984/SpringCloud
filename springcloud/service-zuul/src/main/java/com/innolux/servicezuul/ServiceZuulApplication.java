package com.innolux.servicezuul;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author wei.li
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy
public class ServiceZuulApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ServiceZuulApplication.class, args);
		SpringApplication application = new SpringApplication(ServiceZuulApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
		System.out.println("Service-Zuul is running!");
	}
}
