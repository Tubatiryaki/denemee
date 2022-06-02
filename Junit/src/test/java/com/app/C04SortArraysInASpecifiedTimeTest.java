package com.app;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.stream.IntStream;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class C04SortArraysInASpecifiedTimeTest {

	@Test
	void sortArrayInASpecifiedTimeTest1() {
		C04SortArraysInASpecifiedTime obj=new C04SortArraysInASpecifiedTime();
		assertTimeout(Duration.ofSeconds(5), 
				()->IntStream.rangeClosed(1, 10000).forEach(t->obj.sortArraysInASpecifiedTime()));
	}
	
	C04SortArraysInASpecifiedTime obj=new C04SortArraysInASpecifiedTime();
	@RepeatedTest(10000)
	void sortArrayInASpecifiedTimeTest2() {
		assertTimeout(Duration.ofSeconds(5),()->obj.sortArraysInASpecifiedTime());
	}

}






















