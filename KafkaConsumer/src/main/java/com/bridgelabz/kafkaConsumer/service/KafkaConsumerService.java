package com.bridgelabz.kafkaConsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.bridgelabz.kafkaConsumer.model.User;

@Service
public class KafkaConsumerService {

	@KafkaListener(groupId = "groupId", topics = "test1", containerFactory = "kafkaListenerContainerFactory")
	public User sendMessage(User user) {
		System.out.println("#########");
		return user;
	}

}
