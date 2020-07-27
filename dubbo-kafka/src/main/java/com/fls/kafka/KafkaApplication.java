package com.fls.kafka;

import com.fls.kafka.config.ApplicationStartup;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(KafkaApplication.class);
        application.addListeners(new ApplicationStartup());
        application.run( args);


    }

}
