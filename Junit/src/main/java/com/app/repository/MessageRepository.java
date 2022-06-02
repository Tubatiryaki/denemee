package com.app.repository;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class MessageRepository {
	
	private List<String> list=Arrays.asList("Hello","Merhaba","Halo");
	
	
	public List<String> getMessages() throws SQLException {
		return list;
	}
	
	public void addMessage(String message) {
		list.add(message);
	}
	
	public void removeMessage(String message) {
		list.remove(message);
	}

}
