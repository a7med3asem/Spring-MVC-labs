package com.practice.gettingStarted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*
* This tells application server to go ahead and create DispatcherServlet to serve things
* and lok for controller annotated classes and its GetMappings
* */
@SpringBootApplication
public class GettingStartedApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(GettingStartedApplication.class, args);
    }
}
