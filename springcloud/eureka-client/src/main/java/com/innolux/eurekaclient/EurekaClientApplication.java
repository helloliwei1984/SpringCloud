package com.innolux.eurekaclient;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wei.li
 */
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientApplication {

	public static void main(String[] args) {
		//SpringApplication.run(EurekaClientApplication.class, args);
		SpringApplication application = new SpringApplication(EurekaClientApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
		System.out.println("EurekaClient-1 is running!");
	}
}
