package com.tpe.repository;

import org.springframework.stereotype.Component;

@Component("dbRepository")
public class DBMessageRepository implements Repository {
	
	@Override
	public void saveMessage(String string) {
		System.out.println("I am saving the message in DB");		
	}

}
