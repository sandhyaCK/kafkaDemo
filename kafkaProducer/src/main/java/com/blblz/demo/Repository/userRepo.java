package com.blblz.demo.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.blblz.demo.model.User;


@Repository
public class userRepo{
	@PersistenceContext
	private EntityManager manager;
	
	public void saveMethod(User user) {
		Session session = manager.unwrap(Session.class);
		session.save(user);
		
	}



	
	
}
	
