package com.innolux.springcloudconfigserver;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author wei.li
 */
@SpringBootApplication
@EnableConfigServer
public class SpringcloudConfigServerApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringcloudConfigServerApplication.class, args);
		SpringApplication application = new SpringApplication(SpringcloudConfigServerApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
		System.out.println("Config-Server is running!");
	}
}
