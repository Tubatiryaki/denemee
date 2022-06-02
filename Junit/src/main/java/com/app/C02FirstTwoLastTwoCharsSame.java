package com.app;

public class C02FirstTwoLastTwoCharsSame {

	public boolean checkIfFirstTwoLastTwoAreSame(String str) {
		if(str.length()<=1) {
			return false;
		}
		
		if(str.length()==2) {
			return true;
		}
		
		String firstTwoChars=str.substring(0,2);
		//Merha->ba
		String lastTwoChars=str.substring(str.length()-2);
		
		return firstTwoChars.equals(lastTwoChars);
	}
}
