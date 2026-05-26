
package com.company.sync.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class RetryService {
 private final KafkaTemplate<String,String> kafka;
 public RetryService(KafkaTemplate<String,String> k){this.kafka=k;}
 public void sendRetry(String msg){kafka.send("retry-topic",msg);} 
}
