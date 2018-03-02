package com.innolux.servicezipkin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import zipkin.server.EnableZipkinServer;

/**
 * @author wei.li
 */
@SpringBootApplication
@EnableZipkinServer
public class ServiceZipkinApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ServiceZipkinApplication.class, args);
        SpringApplication application = new SpringApplication(ServiceZipkinApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
        System.out.println("Service-Zipkin is running!");
    }
}
