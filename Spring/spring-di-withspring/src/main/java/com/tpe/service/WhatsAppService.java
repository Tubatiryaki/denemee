package com.tpe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tpe.repository.MessageRepository;

@Component("whatsAppService")
public class WhatsAppService implements MessageService {
	
	//Dependency injection 
	//Otomatik olarak bu nesneyi bu sınıfa bağla
	@Autowired
	private MessageRepository repository;
	

	@Override
	public String sendMessage() {
		repository.saveMessage("I am a Whatsapp Service, I sent a wa message");
		return "I am a Whatsapp Service, I sent a wa message";
	}

}
