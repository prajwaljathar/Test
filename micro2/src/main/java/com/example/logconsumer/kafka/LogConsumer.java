package com.example.logconsumer.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LogConsumer {

    @KafkaListener(topics = "log-topic", groupId = "log-group")
    public void consume(String message) {
        System.out.println("Consumed log: " + message);
    }
}