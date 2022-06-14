package com.tpe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.tpe.thirdparty.ThirtPartyComponent;

@Configuration
@ComponentScan("com.tpe")
@PropertySource("classpath:application.properties")
//Bu package altındaki tüm sınıfları tarayacak şayet sınıfların içerisinde 
//ilgili spring annotationları gorunce (component) bean oluşturup Container'a ekleyecek
public class AppConfiguration {
	
	//ThirdParty bileşenleri Spring container tarafından oluşturulup Container!a konması için @Bean
	//annotationu kullandık.
	@Bean 
	public ThirtPartyComponent thirdPartyComponent() {
		return new ThirtPartyComponent();
	}

}
