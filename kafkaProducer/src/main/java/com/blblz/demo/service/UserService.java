package com.blblz.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blblz.demo.Repository.userRepo;
import com.blblz.demo.model.User;


@Service
public class UserService {
@Autowired
private userRepo repo;
@Transactional
public void save(User dto) {
	User user = new User();
	user.setDept(dto.getDept());
	user.setName(dto.getName());
	repo.saveMethod(user);
}

}
