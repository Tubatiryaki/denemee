package com.tpe.service;

import org.springframework.stereotype.Component;

@Component("mailService")
public class MailService implements MessageService {

	@Override
	public String sendMessage() {
		return "I am a mail service, I sent a message";
	}

}
