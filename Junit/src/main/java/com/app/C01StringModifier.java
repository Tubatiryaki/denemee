package com.app;

public class C01StringModifier {
	
	//AABC->BC,ABC->BC
	public String deleteAIfItIsinFirstTwoPosition(String str) {
		if(str.length()<=2) {
			return str.replaceAll("A", "");
		}
		
		String firstTwoChars=str.substring(0,2);
		String afterFirstTwoChars=str.substring(2);
		
		return firstTwoChars.replaceAll("A","")+ afterFirstTwoChars;
	}

}
