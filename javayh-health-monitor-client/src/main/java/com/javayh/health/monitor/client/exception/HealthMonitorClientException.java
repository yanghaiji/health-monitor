package com.javayh.health.monitor.client.exception;

/**
 * <p>
 * 异常处理类
 * </p>
 *
 * @author Dylan
 * @version 1.0.0
 * @since 2021-04-14
 */
public class HealthMonitorClientException extends Exception{

    public HealthMonitorClientException() {
        super();
    }

    public HealthMonitorClientException(String message) {
        super(message);
    }

    public HealthMonitorClientException(String message, Throwable cause) {
        super(message, cause);
    }
}
