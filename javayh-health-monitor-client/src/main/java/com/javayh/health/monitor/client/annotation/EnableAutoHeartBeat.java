package com.javayh.health.monitor.client.annotation;

import com.javayh.health.monitor.client.selector.HeartImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * 自动开启心跳检测
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2020-03-10 15:36
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Deprecated
@Import(HeartImportSelector.class)
public @interface EnableAutoHeartBeat {

}
