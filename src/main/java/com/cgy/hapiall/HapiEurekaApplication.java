package com.cgy.hapiall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HapiEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HapiEurekaApplication.class, args);
    }

}
