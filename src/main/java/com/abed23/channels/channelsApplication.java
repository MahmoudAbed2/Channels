package com.abed23.channels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.abed23.channels")
public class channelsApplication {
    public static void main(String[] args) {
        SpringApplication.run(channelsApplication.class, args);
    }
}
