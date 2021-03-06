package com.dubbo.demo;

import com.dubbo.demo.config.ApplicationStartup;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author songfz
 */
@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication application =   new SpringApplication(ApiApplication.class);
        application.addListeners(new ApplicationStartup());
        application.run(args);
    }
}
