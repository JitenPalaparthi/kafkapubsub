package com.jpworks.kafkapubsub.messaging;
import org.slf4j.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

@Service
public class Producer {
private static final Logger logger=LoggerFactory.getLogger(Producer.class)    ;
private static String TOPIC="Demo";  

@Autowired  
private KafkaTemplate<String,String> kafkaTemplate;

public void sendMessage(String message){
    logger.info(String.format(">>>>>>>>>---> Producer Message %s",message));
    this.kafkaTemplate.send(TOPIC, message);
}
}
