package com.javayh.health.monitor.client.handler;

import com.javayh.health.monitor.client.encode.HeartbeatEncode;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.timeout.IdleStateHandler;

/**
 * <p>
 *  	自定义 ChannelInitializer
 * </p>
 *
 * @version 1.0.0
 * @author Dylan-haiji
 * @since 2020/3/10
 */
public class ClientHandleInitializer extends ChannelInitializer<Channel> {

	@Override
	protected void initChannel(Channel channel) throws Exception {
		channel.pipeline()
				// 10 秒没发送消息 将IdleStateHandler 添加到 ChannelPipeline 中
				.addLast(new IdleStateHandler(0, 10, 0)).addLast(new HeartbeatEncode())
				.addLast(new EchoClientHandler());
	}

}
