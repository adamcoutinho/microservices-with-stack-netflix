package com.main.fileuploadserver;

import app.main.config.FileStoreConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigurationProperties({
        FileStoreConfig.class
})
@ComponentScan(value = {"app.main.endpoints","app.main.services","app.main.config"})
public class FileuploadServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileuploadServerApplication.class, args);
    }

}
