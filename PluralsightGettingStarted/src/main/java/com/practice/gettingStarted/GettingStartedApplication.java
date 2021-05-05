package com.practice.gettingStarted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class GettingStartedApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(GettingStartedApplication.class, args);
    }
}
