package com.app.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.app.repository.MessageRepository;

@ExtendWith(MockitoExtension.class)
public class MessageServiceTest2 {

	@Mock
	MessageRepository repository;
	
	@InjectMocks
	MessageService service;
	
	@Test
	void testGetMessageWithLengthLessThanFive() {
		try {
			when(repository.getMessages()).
				thenReturn(Arrays.asList("Junit","Mockito","Mock","Test","Message"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<String> actualList = service.getMessageWithLengthLessThanFive();
		
		assertNotNull(actualList);
		assertEquals(2, actualList.size());
	}
	
	@Test
	void testException() {
		try {
			when(repository.getMessages()).thenThrow(new SQLException("Connection Exception"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<String> messages = service.getMessages();
		
		assertNotNull(messages);
		assertEquals(0, messages.size());
	}
	
}
