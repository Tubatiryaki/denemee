package com.app.service;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

//Birim testi sadece bir birimi test eder, o nedenle bağımlılıkların izole edilmesi gerekir.
//böylece bağımlılıkların yan etkilerinin önlenmesi sağlanır.
//Gerçek nesneler  beklenmedik durumlara neden olabilir.
//Gerçek nesneler yavaş çalışabilir ve zor bir şekilde yapılandırılır.
//Gerçek nesneler tekrar edilebilir olmayabilir.
//JAva da mocking işlemlerini yapabilmek için Mockito, JMockit ve EasyMock kütüphaneler kullanılabilir.
//

class MessageServiceTest1 {

	@Test
	void addMessageTest() {
		MessageService service = mock(MessageService.class);

		service.addMessage("Merhaba");
		service.addMessage("Mockito");

		verify(service).addMessage("Mockito");

	}

	@Test
	void howManyCallTest() {
		MessageService service = mock(MessageService.class);

		service.addMessage("Merhaba");
		service.addMessage("Merhaba");
		service.addMessage("Mockito");

		// verify(service,times(2)).addMessage("Merhaba");

		// verify(service,never()).removeMessage(any());

		verify(service, atLeast(2)).addMessage("Merhaba");

	}

	@Test
	void callOrderTest() {
		MessageService service = mock(MessageService.class);

		service.addMessage("Merhaba");
		service.addMessage("Mockito");
		
		InOrder inOrder=inOrder(service);
		
		inOrder.verify(service).addMessage("Merhaba");
		inOrder.verify(service).addMessage("Mockito");
		
		
	}

}
