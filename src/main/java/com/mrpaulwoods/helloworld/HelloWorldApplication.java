package com.mrpaulwoods.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(HelloWorldApplication.class);

    public static void main(String[] args) {
        log.info("STARTING THE APPLICATION");
        SpringApplication.run(HelloWorldApplication.class, args);
        log.info("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) {
        log.info("EXECUTING");
        System.out.println("####################################################################################");
        System.out.println("##### Hello World - V1");
        System.out.println("####################################################################################");
    }

}
