package com.javayh.health.monitor.server.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p>
 *
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2021/4/13
 */
@ConfigurationProperties(prefix = "health.monitor.server")
public class HeartBeatProperties {

	private Integer port;
	private String logEnable;

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public String getLogEnable() {
		return logEnable;
	}

	public void setLogEnable(String logEnable) {
		this.logEnable = logEnable;
	}
}
