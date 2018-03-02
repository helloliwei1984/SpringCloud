package com.innolux.springbootoauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
public class SpringbootOauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootOauth2Application.class, args);
    }
}
