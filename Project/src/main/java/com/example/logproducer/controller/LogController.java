package com.example.logproducer.controller;


import org.springframework.web.bind.annotation.*;
import com.example.logproducer.kafka.LogProducer;

@RestController
@RequestMapping("/logs")
public class LogController {
    private final LogProducer logProducer;

    public LogController(LogProducer logProducer) {
        this.logProducer = logProducer;
    }

    @PostMapping("/send")
    public String sendLog(@RequestBody String log) {
        logProducer.sendLog(log);
        return "Log sent: " + log;
    }
}