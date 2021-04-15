package com.javayh.health.monitor.client.heart;

import com.javayh.health.monitor.client.properties.HeartbeatClientProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * <p>
 *      通过CommandLineRunner 方式启动，这样可以进行正常的http请求
 * </p>
 *
 * @author Dylan
 * @version 1.0.0
 * @since 2021-04-14
 */
@Component
public class HealthMonitorClientRunner implements CommandLineRunner {

    private final HeartbeatClientProperties heartBeatProperties;
    private final HeartbeatClient client;

    public HealthMonitorClientRunner(HeartbeatClientProperties heartBeatProperties,
                                     HeartbeatClient client) {
        this.heartBeatProperties = heartBeatProperties;
        this.client = client;
    }

    @Override
    public void run(String... args) throws Exception {
        client.start(heartBeatProperties);
    }
}
