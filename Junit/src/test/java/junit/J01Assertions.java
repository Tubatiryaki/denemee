package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class J01Assertions {

//	@Test
//	void test() {
//		//fail("Not yet implemented");
//	}
	
	
	//testisNotanAdultIfAgeLessThan18
	
	//test[Feature being Tested //Hangi özellik test ediliyorsa yazılır.]
	@Test
	void testLength() {
		int actualLength="Merhaba".length();
		int expectedLength=7;
		
//		assertEquals(expectedLength, actualLength);
		
		//assertEquals(expectedLength, actualLength,"Length are not matched");
		
		//assertTrue(expectedLength==actualLength,"Actual length is not matching with expexted length");
		
		//assertFalse(expectedLength==actualLength);	
		
	}
	
	
	
	@Test
	void testUpperCase() {
		String actualValue= "hello".toUpperCase();
		String expectedValue="HELLO";
		
		assertEquals(expectedValue,actualValue);
	}
	
	@Test
	void testContainsMethod() {
		assertEquals(false, "Bekir".contains("t"));
	}
	

}
