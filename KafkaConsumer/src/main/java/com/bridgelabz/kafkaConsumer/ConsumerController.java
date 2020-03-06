package com.bridgelabz.kafkaConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.kafkaConsumer.model.User;
import com.bridgelabz.kafkaConsumer.service.KafkaConsumerService;

@RestController
public class ConsumerController {

	@Autowired
	KafkaConsumerService kafkaConsumerService;
	User user=new User();

	@GetMapping(value = "consumer")
	public User fromUser() {
		return kafkaConsumerService.sendMessage(user);

	}

}
