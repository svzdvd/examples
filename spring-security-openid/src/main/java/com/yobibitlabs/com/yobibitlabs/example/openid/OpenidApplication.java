package com.yobibitlabs.com.yobibitlabs.example.openid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class OpenidApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(OpenidApplication.class, args);
    }
}
