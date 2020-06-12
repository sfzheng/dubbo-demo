package com.fls.kafuka;

import com.fls.kafuka.config.ApplicationStartup;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboKafukaApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DubboKafukaApplication.class);
        application.addListeners(new ApplicationStartup());
        application.run( args);


    }

}
