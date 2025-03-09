package com.example.logproducer.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class LogProducer {
    private static final String TOPIC = "log-topic";
    private final KafkaTemplate<String, String> kafkaTemplate;

    public LogProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendLog(String log) {
        kafkaTemplate.send(TOPIC, log);
    }
}
