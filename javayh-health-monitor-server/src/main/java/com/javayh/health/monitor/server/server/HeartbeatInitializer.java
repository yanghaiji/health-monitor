package com.javayh.health.monitor.server.server;

import com.javayh.health.monitor.server.encode.HeartbeatDecoder;
import com.javayh.health.monitor.server.handler.HeartBeatSimpleHandler;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.timeout.IdleStateHandler;

/**
 * <p>
 * 自定义 ChannelInitializer
 * </p>
 *
 * @author Dylan-haiji
 * @version 1.0.0
 * @since 2021/4/13
 */
public class HeartbeatInitializer extends ChannelInitializer<Channel> {

    @Override
    protected void initChannel(Channel channel) throws Exception {
        channel.pipeline()
                /*
                 * IdleStateHandler  空闲状态的处理器
                 * long readerIdleTime, 多长时间没有读出数据，就会发送心跳检测，检测是否链接
                 * long writerIdleTime, 多长时间没有写出数据，就会发送心跳检测
                 * long allIdleTime     多长时间没有读写出数据，就会发送心跳检测
                 */
                // 五秒没有收到消息 将IdleStateHandler 添加到 ChannelPipeline 中
                .addLast(new IdleStateHandler(5, 10, 15))
                .addLast(new HeartbeatDecoder())
                .addLast(new HeartBeatSimpleHandler());
    }

}
