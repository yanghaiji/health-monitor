package com.javayh.health.monitor.server.web;

import com.javayh.health.monitor.server.entity.HealthMonitorVO;
import com.javayh.health.monitor.server.util.NettySocketHolder;
import io.netty.channel.Channel;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *      用于维护本地注册表
 * </p>
 *
 * @author Dylan
 * @version 1.0.0
 * @since 2021-04-13
 */
@RestController
@RequestMapping(value = "health/monitor/")
public class HealthMonitorWeb {

    /**
     * <p>
     *       获取现在所以的服务列表
     * </p>
     * @version 1.0.0
     * @since 2021/4/14
     * @param
     * @return java.util.List<com.javayh.health.monitor.server.entity.HealthMonitorVO>
     */
    @GetMapping(value = "list")
    public List<HealthMonitorVO> list(){
        List<HealthMonitorVO> vo = new ArrayList<>();
        Map<String, NioSocketChannel> mapChannel = NettySocketHolder.getMapChannel();
        mapChannel.forEach((k,v)->{
            vo.add(HealthMonitorVO.builder().appName(k).local(v.remoteAddress().getHostName())
            .id(v.pipeline().channel().id().asLongText())
            .port(v.parent().localAddress().getPort()).build());
        });
        return vo;
    }

}
