package com.pankaj.dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerTest {
    private StringToInteger stringToInteger;

    @BeforeEach
    void createInstance(){
        stringToInteger = new StringToInteger();
    }


    @Test
    void myAtoiTest1() {
        String s ="42";
        int result = stringToInteger.myAtoi(s);
        assertEquals(42,result);
    }

    @Test
    void myAtoiTest2() {
        String s ="-042";
        int result = stringToInteger.myAtoi(s);
        assertEquals(-42,result);
    }

    @Test
    void myAtoiTest3() {
        String s ="1337c0d3";
        int result = stringToInteger.myAtoi(s);
        assertEquals(1337,result);
    }

    @Test
    void myAtoiTest4() {
        String s ="0-1";
        int result = stringToInteger.myAtoi(s);
        assertEquals(0,result);
    }
    @Test
    void myAtoiTest5() {
        String s ="words and 987";
        int result = stringToInteger.myAtoi(s);
        assertEquals(0,result);
    }
    @Test
    void myAtoiTest6(){
        String s ="-91283472332";
        int result = stringToInteger.myAtoi(s);
        assertEquals(Integer.MIN_VALUE,result);
    }
    @Test
    void myAtoiTest7(){
        String s ="91283472332";
        int result = stringToInteger.myAtoi(s);
        assertEquals(Integer.MAX_VALUE,result);
    }
    @Test
    void myAtoiTest8(){
        String s ="+9";
        int result = stringToInteger.myAtoi(s);
        assertEquals(9,result);
    }
    @Test
    void myAtoiTest10(){
        String s ="+-9";
        int result = stringToInteger.myAtoi(s);
        assertEquals(0,result);
    }
    @Test
    void myAtoiTest11(){
        String s ="+9 123";
        int result = stringToInteger.myAtoi(s);
        assertEquals(9,result);
    }


}