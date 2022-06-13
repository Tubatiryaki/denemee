package com.tpe;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.tpe")
//Bu package altındaki tüm sınıfları tarayacak şayet sınıfların içerisinde 
//ilgili spring annotationları gorunce (component) bean oluşturup Container'a ekleyecek
public class AppConfiguration {
	
	

}
