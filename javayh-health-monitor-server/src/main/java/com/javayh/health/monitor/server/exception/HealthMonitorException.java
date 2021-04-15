package com.javayh.health.monitor.server.exception;

/**
 * <p>
 * 异常处理类
 * </p>
 *
 * @author Dylan
 * @version 1.0.0
 * @since 2021-04-14
 */
public class HealthMonitorException extends Exception{

    public HealthMonitorException() {
        super();
    }

    public HealthMonitorException(String message) {
        super(message);
    }

    public HealthMonitorException(String message, Throwable cause) {
        super(message, cause);
    }
}
