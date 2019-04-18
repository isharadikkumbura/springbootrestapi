package com.ishara;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class MainApplicationClass {

    public static void main(String[] args) {
        SpringApplication.run(MainApplicationClass.class, args);
        //Query using this >> http://localhost:8080/api/user/2
    }
}
