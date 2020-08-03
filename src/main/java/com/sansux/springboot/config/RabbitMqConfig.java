package com.sansux.springboot.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author: zhouhaihua
 * @date: 2020/7/6 15:58
 * @Description:
 */

//@Configuration
public class RabbitMqConfig {

//    @Value("${spring.rabbitmq.host}")
//    private String host;
//
//    @Value("${spring.rabbitmq.port}")
//    private int port;
//
//    @Value("${spring.rabbitmq.username}")
//    private String username;
//
//    @Value("${spring.rabbitmq.password}")
//    private String password;
//
//    Queue queue(){
//        return new Queue("StringQueue");
//    }
//
//
//    @Bean
//    public ConnectionFactory connectionFactory(){
//        CachingConnectionFactory factory = new CachingConnectionFactory(host, port);
//        factory.setUsername(username);
//        factory.setPassword(password);
//        factory.setVirtualHost("/");
//        factory.setPublisherConfirms(true);
//        return factory;
//    }
//
//    @Bean
//    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//    //必须是prototype类型
//    public RabbitTemplate rabbitTemplate() {
//        RabbitTemplate template = new RabbitTemplate(connectionFactory());
//        return template;
//    }

}
