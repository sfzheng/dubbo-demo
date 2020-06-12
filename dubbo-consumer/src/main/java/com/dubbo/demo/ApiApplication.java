package com.dubbo.demo;

import com.dubbo.demo.config.ApplicationStartup;
import com.dubbo.demo.config.CousleProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.InitBinder;

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
