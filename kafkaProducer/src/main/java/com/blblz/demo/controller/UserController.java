package com.blblz.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import com.blblz.demo.model.User;
import com.blblz.demo.service.UserService;

@RestController
public class UserController {
@Autowired
private UserService service;
    @Autowired
   private KafkaTemplate<String, User> KafkaJsontemplate;
    String TOPIC_NAME = "test1";
    User users = new User();

    @PostMapping(value = "/postUser",consumes = {"application/json"},produces = {"application/json"})
    public String postJsonMessage(@RequestBody User user){
        KafkaJsontemplate.send(TOPIC_NAME,new User(user.getId(),user.getName(),user.getDept()));
        System.out.println("############");
        service.save(user);
        return "Message published successfully";
    }
}
