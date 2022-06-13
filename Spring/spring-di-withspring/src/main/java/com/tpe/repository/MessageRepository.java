package com.tpe.repository;

import org.springframework.stereotype.Component;

@Component
public class MessageRepository {
	public void saveMessage(String message) {
		System.out.println("I am saving the message");
	}

}
