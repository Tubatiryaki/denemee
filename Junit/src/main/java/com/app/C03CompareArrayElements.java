package com.app;

import java.util.Arrays;

public class C03CompareArrayElements {
	public <T> boolean compareElementsOfTwoArray(T[] a1,T[] a2) {
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if(Arrays.equals(a1, a2)) {
			return true;
		}else {
			return false;
		}
	}
	
}
