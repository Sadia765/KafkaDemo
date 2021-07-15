package com.example.kafka.springbootkafka;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    //test_topic
    private static final String TOPIC = "test_topic2";
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessages(String messages){
        this.kafkaTemplate.send(TOPIC, messages);
    }

}
