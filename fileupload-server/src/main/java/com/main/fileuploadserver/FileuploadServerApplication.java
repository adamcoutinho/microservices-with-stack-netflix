package com.main.fileuploadserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(value = {"app.main.endpoints"})
public class FileuploadServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileuploadServerApplication.class, args);
    }

}
