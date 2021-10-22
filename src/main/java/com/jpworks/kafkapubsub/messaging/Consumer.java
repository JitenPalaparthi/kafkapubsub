package com.jpworks.kafkapubsub.messaging;
import org.slf4j.*;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
private final Logger logger = LoggerFactory.getLogger(Producer.class)    ;

@KafkaListener(topics="Demo",groupId = "group_id")
public void consume(String message){
    logger.info(String.format("<<<<<<<<---> Consumer Message --> %s",message));
}
}
