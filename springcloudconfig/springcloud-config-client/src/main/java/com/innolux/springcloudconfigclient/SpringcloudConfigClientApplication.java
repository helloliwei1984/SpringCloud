package com.innolux.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wei.li
 */
@SpringBootApplication
@RestController
@RefreshScope
public class SpringcloudConfigClientApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringcloudConfigClientApplication.class, args);
		SpringApplication application = new SpringApplication(SpringcloudConfigClientApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
		System.out.println("Config-Client is running!");
	}

    @Value("${testconfig.name}")
    String name;

	@GetMapping("hello")
    public String hello(){
	    return name;
    }

}
