package junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class J04BeforeAll_AfterAll {
	
	
	@BeforeAll
	static void beforeAll(TestInfo info) {
		System.out.println(info.getDisplayName()+" open a file");
	}
	
	@Test
	void testWithArrays() {
		String str="Unit test with JUnit5";
		String actualResult[]=str.split(" ");
		String expectedResult[]= {"Unit","test","with","JUnit5"};
		
		assertArrayEquals(expectedResult,actualResult,"Arrays are not equal");
	}
	
	@AfterAll
	static void afterAll(TestInfo info) {
		
		System.out.println(info.getDisplayName()+" close file");
	}

}
