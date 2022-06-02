package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class J10GroupingTest {


	@Nested
	class multiplyTest{
		@ParameterizedTest
		@CsvSource(value={"-12,-4,3","-12, 4,-3","12,4,3","12,-4,-3"})
		void multiplyTestWithNonZero(int rs, int x, int y) {
			assertEquals(rs, Math.multiplyExact(x, y));
		}
		
		
		@ParameterizedTest
		@CsvSource(value= {"0,-4,0","0,4,0","0,0,0","0,0,-3"})
		void multipylTestWithZero(int rs,int x,int y ) {
			assertEquals(rs, Math.multiplyExact(x, y));
		}
		
	}
	
	
	@Nested
	class addTest{
		@ParameterizedTest
		@CsvSource(value= {"-1,-4,3","1,4,-3","-2,-5,3","4,-1,5"})
		void addTestWithNonZero(int rs,int x,int y) {
			assertEquals(rs, Math.addExact(x, y));
		}
		
		
		@ParameterizedTest
		@CsvSource(value= {"-4,-4,0","4,4,0","0,0,0"})
		void addTestWithZero(int rs, int x,int y) {
			assertEquals(rs, Math.addExact(x, y));
		}
	}
	

}
