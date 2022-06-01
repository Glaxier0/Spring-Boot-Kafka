package com.glaxier.producer.controller;

import com.glaxier.producer.model.Message;
import com.glaxier.producer.services.KafkaProducer;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/kafka")
public class KafkaController {
    private final KafkaProducer kafkaProducer;

    @PostMapping("/publish")
    public void sendMessageToKafkaTopic(@RequestBody Message message) {
        this.kafkaProducer.sendMessage(message);
    }
}