package com.innolux.clientzipkin2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author wei.li
 */
@SpringBootApplication
@RestController
public class ClientZipkin2Application {

    public static void main(String[] args) {
        //SpringApplication.run(ClientZipkin2Application.class, args);
        SpringApplication application = new SpringApplication(ClientZipkin2Application.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
        System.out.println("Client-Zipkin is running!");
    }
    private static final Logger LOG = Logger.getLogger(ClientZipkin2Application.class.getName());


    @RequestMapping("/hello")
    public String home(){
        LOG.log(Level.INFO, "calling trace Client-Zipkin2!");
        return "It's Client-Zipkin2!";
    }

    @RequestMapping("/client2")
    public String info(){
        LOG.log(Level.INFO, "Client-Zipkin2 is being called");
        return restTemplate.getForObject("http://localhost:8988/client",String.class);
    }

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}