package com.ConsumerApplication.Consumer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListner {
// this will be used one con to consume the data from kafka
    Logger log = LoggerFactory.getLogger(KafkaMessageListner.class);
    @KafkaListener(topics = "KafkaProjectExampleProducerTopic" , groupId = "chand-example-kafka")
    public void consume(String message) {
    log.info("consumer consume the message that we are reciving {}"+message);
    }
    // creating multiple cons to consume from individual topics

    @KafkaListener
    public void consume2(String message) {
        log.info("consumer consume2 the message that we are reciving {}"+message);
    }

    @KafkaListener
    public void consumer3(String message) {
        log.info("consumer consume3 the message that we are reciving {}"+message);
    }

    @KafkaListener
    public void consumer4(String message){
        log.info("consumer consume4 the message that we are reciving {}"+message);
    }

    @KafkaListener
    public void consumer5(String message){
        log.info("consumer consume5 the message that we are reciving {}"+message);
    }
}
