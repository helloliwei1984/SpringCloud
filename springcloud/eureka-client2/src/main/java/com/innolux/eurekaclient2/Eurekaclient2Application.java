package com.innolux.eurekaclient2;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wei.li
 */
@EnableEurekaClient
@SpringBootApplication
public class Eurekaclient2Application {

	public static void main(String[] args) {
		//SpringApplication.run(Eurekaclient2Application.class, args);

		SpringApplication application = new SpringApplication(Eurekaclient2Application.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
		System.out.println("EurekaClient-2 is running!");
	}
}
