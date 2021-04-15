package com.javayh.health.monitor.client.config;

import com.javayh.health.monitor.client.entity.MessageBody;
import com.javayh.health.monitor.client.properties.HeartbeatClientProperties;
import org.springframework.context.annotation.Bean;

import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @version 1.0.0
 * @author Dylan-haiji
 * @since 2020/3/10
 */
public class HeartBeatConfig {

	@Bean(value = "heartBeat")
	public MessageBody heartBeat(HeartbeatClientProperties properties) {
		return MessageBody.builder()
                .msgId(properties.getChannelId())
                .msg("ping")
                .appName(properties.getAppName())
                .createDate(new Date()).build();
	}

}
