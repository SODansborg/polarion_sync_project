
package com.company.sync.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EventConsumer {
 @KafkaListener(topics="polarion-events")
 public void consume(String msg){System.out.println(msg);} 
}
