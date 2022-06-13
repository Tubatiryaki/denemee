package service;

public class SMSService implements MessageService {

	@Override
	public String sendMessage() {
		return "I am an SMS Service, I sent an SMS";
	}
}
