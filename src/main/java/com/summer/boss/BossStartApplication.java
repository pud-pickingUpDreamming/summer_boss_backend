package com.summer.boss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author john
 */
@SpringBootApplication(scanBasePackages = "com.summer.boss")
public class BossStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(BossStartApplication.class, args);
    }
}
