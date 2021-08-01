package com.mana.springannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMyCustomConfiguration
public class DemoAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAnnotationApplication.class, args);
    }

}
