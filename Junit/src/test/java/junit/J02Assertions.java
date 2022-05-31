package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class J02Assertions {

	@Test
	void testToFindMin() {
		//assertTrue(11.5==Math.min(11.5, 14.4));
		
		//contidion sonucu false ise test success olur. Çünkü false değeri assert ediliyor.
		//assertFalse(Math.min(12.3, 13.5 )!=12.3);
		
		assertEquals(14.5, Math.min(14.5,17.6));
	}
	
	
	@Test
	void  testArrays() {
		String str="Junit5 is better than Junit4";
		
		String[] actualArr=str.split(" ");
		String[] expectedArr= {"Junit5","is","better","than","Junit4"};
		
		assertTrue(Arrays.equals(expectedArr, actualArr));
	}

}
