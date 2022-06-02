package com.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class C01StringModifierTest {

	C01StringModifier strModifier;
	
	@BeforeEach
	void setUp() {
		strModifier=new C01StringModifier();
		System.out.println("@BeforeEach is executed");
	}
	
	@AfterEach
	void tearDown() {
		strModifier=null;
		System.out.println("@AfterEach is executed");
	}
	
	@ParameterizedTest
	@CsvSource(value= {"BC,AABC","BC,ABC","BC,BAC","BCD,BCD","'',AA"})
	void deleteAIfItisinFirstTwoPositionsTest(String expected,String param) {
		assertEquals(expected, strModifier.deleteAIfItIsinFirstTwoPosition(param));
		System.out.println("Executed");
	}


}
