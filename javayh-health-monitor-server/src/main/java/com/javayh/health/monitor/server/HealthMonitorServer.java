package com.javayh.health.monitor.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * 启动类
 * </p>
 *
 * @author Dylan
 * @version 1.0.0
 * @since 2021-04-13
 */
@SpringBootApplication
public class HealthMonitorServer {
    public static void main(String[] args) {
        SpringApplication.run(HealthMonitorServer.class,args);
    }
}
