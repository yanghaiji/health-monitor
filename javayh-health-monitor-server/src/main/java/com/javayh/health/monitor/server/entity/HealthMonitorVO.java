package com.javayh.health.monitor.server.entity;

import lombok.Builder;
import lombok.Data;

/**
 * <p>
 *
 * </p>
 *
 * @author Dylan
 * @version 1.0.0
 * @since 2021-04-13
 */
@Builder
@Data
public class HealthMonitorVO {
    private String id;
    private String appName;
    private String local;
    private Integer port;
}
