package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class J03BeforeEach_AfterEach {
	
	String str;
	
	@BeforeEach
	void beforeEach() {
		str="Junit5 is better than Junit4";
		System.out.println("beforeEach() is executed");
	}

	@AfterEach
	void afterEach() {
		str=null;
		System.out.println("afterEach() is executed");
	}
	
	@Test
	void testArrays(TestInfo info) {
       String[] actualArr=str.split(" ");
       String[] expectedArr= {"Junit5","is","better","than","Junit4"};
       
       System.out.println(info.getDisplayName()+" is executed");
       
       assertTrue(Arrays.equals(actualArr, expectedArr));
		
	}
	
	@Test
	void testStringLength(TestInfo info) {
		int actualLength= str.length();
		int expectedLength=28;
		
		assertEquals(expectedLength, actualLength);
		
		System.out.println(info.getDisplayName()+" is executed");
	}
	
}
