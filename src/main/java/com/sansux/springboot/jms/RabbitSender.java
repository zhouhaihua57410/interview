package com.sansux.springboot.jms;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author: zhouhaihua
 * @date: 2020/7/6 15:46
 * @Description:
 */

@Component
public class RabbitSender {

    @Resource(name = "testAmqpTemplate")
    private AmqpTemplate amqpTemplate;

    public String sendString(String routingKey, String message){
        amqpTemplate.convertAndSend(routingKey, message);
        return "string send ok!";
    }
}
