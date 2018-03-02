package com.innolux.serviceadmin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class ServiceAdminApplication {

    public static void main(String[] args) {
       // SpringApplication.run(ServiceAdminApplication.class, args);
        SpringApplication application = new SpringApplication(ServiceAdminApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
        System.out.println("Service-Admin is running!");
    }
}
