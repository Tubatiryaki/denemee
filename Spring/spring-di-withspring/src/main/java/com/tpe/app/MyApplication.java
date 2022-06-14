package com.tpe.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tpe.AppConfiguration;
import com.tpe.service.MessageService;
import com.tpe.thirdparty.ThirtPartyComponent;

public class MyApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new 
				AnnotationConfigApplicationContext(AppConfiguration.class);
	
//		MessageService  service= context.getBean("whatsAppService",MessageService.class);
//	
//		System.out.println(service.sendMessage());
		
		
		MessageService  service2= context.getBean("mailService",MessageService.class);
		System.out.println(service2.sendMessage());
	
		
		
		ThirtPartyComponent thirdPartyComponent= context.
				getBean("thirdPartyComponent",ThirtPartyComponent.class);
		
		System.out.println(thirdPartyComponent.getMessage());
		
		context.close();
	}

}
