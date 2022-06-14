package com.tpe.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mailService")
public class MailService implements MessageService {
	
	@Value("${app.email}")
	private String email;
	
	
	@Value("${app.count}")
	private Integer count;
	
	

	@Override
	public String sendMessage() {
		return "I am a mail service, I sent a message:"+email+":"+count;
	}
	
	
	public String getEmail() {
		return this.email;
	}

}
