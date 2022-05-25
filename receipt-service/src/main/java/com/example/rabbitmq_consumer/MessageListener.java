package com.example.rabbitmq_consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomMessage message) {
        PDFMaker pdf = new PDFMaker(message.getMessage());
        System.out.println(message);
    }

}