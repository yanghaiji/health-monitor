package com.javayh.health.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *
 * </p>
 *
 * @author Dylan
 * @version 1.0.0
 * @since 2021-04-13
 */
@SpringBootApplication(scanBasePackages = "com.javayh")
public class DemoHealthMonitor {
    public static void main(String[] args) {
        SpringApplication.run(DemoHealthMonitor.class,args);
    }

}
