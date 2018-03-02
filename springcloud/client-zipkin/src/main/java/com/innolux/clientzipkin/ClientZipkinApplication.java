package com.innolux.clientzipkin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
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
public class ClientZipkinApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ClientZipkinApplication.class, args);
        SpringApplication application = new SpringApplication(ClientZipkinApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
        System.out.println("Client-Zipkin is running!");
    }

    private static final Logger LOG = Logger.getLogger(ClientZipkinApplication.class.getName());


    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/hello")
    public String callHome(){
        LOG.log(Level.INFO, "calling trace Client-Zipkin!");
        return restTemplate.getForObject("http://localhost:8989/client2", String.class);
    }
    @RequestMapping("/client")
    public String info(){
        LOG.log(Level.INFO, "Client-Zipkin is being called ");
        return "It's Client-Zipkin";

    }

    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }
}
