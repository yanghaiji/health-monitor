package com.javayh.health.monitor.server.server;

import com.javayh.health.monitor.server.config.HeartBeatProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @author Dylan
 * @version 1.0.0
 * @since 2021-04-13
 */
@Component
@EnableConfigurationProperties(value = HeartBeatProperties.class)
public class HealthMonitorRunner implements CommandLineRunner {

    private final HeartBeatProperties heartBeatProperties;
    private final HeartBeatServer nettyServer;

    public HealthMonitorRunner(HeartBeatServer nettyServer, HeartBeatProperties heartBeatProperties) {
        this.nettyServer = nettyServer;
        this.heartBeatProperties = heartBeatProperties;
    }

    @Override
    public void run(String... args) throws Exception {
        nettyServer.start(heartBeatProperties.getPort());
    }
}
