package com.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class C02FirstTwoLastTwoCharsSameTest {

   C02FirstTwoLastTwoCharsSame obj=new C02FirstTwoLastTwoCharsSame();
   
   @ParameterizedTest
   @CsvSource(value= {"true,ABAB","false,ABBA","false,ABCD","true,AB","false,A","false,''"})
   void check_If_FirstTwo_LastTwo_Chars_AreSame_Test1(boolean rs,String str) {
	   assertEquals(rs, obj.checkIfFirstTwoLastTwoAreSame(str));
   }

   @ParameterizedTest
   @ValueSource(strings= {"ABAB","AB"})
   void check_If_FirstTwo_LastTwo_Chars_AreSame_Test2(String str) {
	   assertTrue(obj.checkIfFirstTwoLastTwoAreSame(str));
   }
   
   
   @ParameterizedTest
   @ValueSource(strings= {"ABBA","ABCD"})
   void check_If_FirstTwo_LastTwo_Chars_AreSame_Test3(String str) {
	   assertFalse(obj.checkIfFirstTwoLastTwoAreSame(str));
   }
   
}
