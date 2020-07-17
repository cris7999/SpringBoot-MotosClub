package com.motoclub.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.motoclub.repository")
@EntityScan(basePackages = "com.motoclub.entity")
@SpringBootApplication(scanBasePackages={
        "com.motoclub.controller", "com.motoclub.services", "com.motoclub.application"})
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}