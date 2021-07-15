package com.example.kafka.springbootkafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "test_topic2", groupId = "group_id")
    public void consumeMessage(String message){
        System.out.println(message);
    }

}
