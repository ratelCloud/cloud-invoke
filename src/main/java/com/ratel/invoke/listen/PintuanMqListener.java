/*
 * 天虹商场股份有限公司版权所有.
 */
package com.ratel.invoke.listen;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;

import java.io.IOException;
import java.util.List;

/**
 * 类说明
 * <p>
 *
 * @author niexiang
 * @version 1.0.0
 * @date 2019/1/14
 */
public class PintuanMqListener {

    private final static String QUEUE_NAME = "pintuan.taskGiveScoreQueue";

    @RabbitListener(queues = QUEUE_NAME)
    @RabbitHandler
    @SuppressWarnings("unchecked")
    public void messageConsume(Message message, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long tag) {





    }

}
