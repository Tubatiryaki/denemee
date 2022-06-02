package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class J07ParameterizedTest {

	@Test
	void testLength1() {
		assertTrue("ABCD".length() > 0);
		assertTrue("ABC".length() > 0);
		assertTrue("A".length() > 0);
		assertTrue("".length() >= 0);
		assertTrue("abcdef".length() > 0);
	}

	@ParameterizedTest
	@ValueSource(strings = { "ABCD", "ABC", "A", "", "abcdefg" })
	void testLength2(String str) {
		assertTrue(str.length() > 0);
	}

	@Test
	void upperCaseTest1() {
		String str1 = "Merhaba";
		String str2 = "Java";
		String str3 = "Junit";

		assertEquals("MERHABA", str1.toUpperCase());
		assertEquals("JAVA", str2.toUpperCase());
		assertEquals("JUNİT", str3.toUpperCase());
	}

	@ParameterizedTest
	@CsvSource(value = { "MERHABA,merhaba", "JAVA,java", "JUNİT,junit", "\"\",\"\""

	})
	void upperCaseTest2(String s1, String s2) {
		assertEquals(s1, s2.toUpperCase());
	}

	@ParameterizedTest
	@CsvSource(value = { "true,java,a", "true, junit,u", "false,hello,a" })
	void containsTest(Boolean b1, String s1, String s2) {
		assertEquals(b1, s1.contains(s2));
	}

}
