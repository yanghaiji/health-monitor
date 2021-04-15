package com.javayh.health.monitor.client.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * <p>
 * 实现字段装配
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-03-02 15:59
 */
public class HeartImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata annotationMetadata) {
		return new String[] { "com.javayh.health.monitor.client.config.HeartBeatConfig",
				"com.javayh.health.monitor.client.heart.HeartbeatClient",
				"com.javayh.health.monitor.client.properties.HeartbeatClientProperties" };
	}

}
