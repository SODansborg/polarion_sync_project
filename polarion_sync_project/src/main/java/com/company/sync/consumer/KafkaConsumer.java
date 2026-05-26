
package com.company.sync.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "polarion-events", groupId = "sync-group")
    public void consume(String message) {
        System.out.println("Received: " + message);
    }
}
