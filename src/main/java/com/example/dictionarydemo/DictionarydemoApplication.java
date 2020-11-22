package com.example.dictionarydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//SpringBoot主入口
@SpringBootApplication
public class DictionarydemoApplication {
    public static void main(String[] args) {
        System.out.printf("dictionary demo is starting...");
        SpringApplication.run(DictionarydemoApplication.class, args);
    }

}
