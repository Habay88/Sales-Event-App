package com.mintyn2.consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OrderEventConsumer {
	 @KafkaListener(topics ={"order-event"})
	    public void onMessage(ConsumerRecord<Long,String> consumerRecord) {

	        log.info("ConsumerRecord : {} ", consumerRecord );
	      //  libraryEventsService.processLibraryEvent(consumerRecord);

	    }
}
