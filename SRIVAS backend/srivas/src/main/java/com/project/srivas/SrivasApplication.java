package com.project.srivas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin
@SpringBootApplication
public class SrivasApplication {
    public static void main(String[] args) {
        SpringApplication.run(SrivasApplication.class, args);
    }
}
