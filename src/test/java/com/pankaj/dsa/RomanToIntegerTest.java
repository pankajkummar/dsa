package com.pankaj.dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {
    private RomanToInteger romanToInteger;

    @BeforeEach
    void createInstance(){
        romanToInteger = new RomanToInteger();
    }

    @Test
    void romanToIntTest1() {
        String s="III";
        int output = romanToInteger.romanToInt(s);
        assertEquals(3,output);
    }
    @Test
    void romanToIntTest2() {
        String s="LVIII";
        int output = romanToInteger.romanToInt(s);
        assertEquals(58,output);
    }
    @Test
    void romanToIntTest3() {
        String s="MCMXCIV";
        int output = romanToInteger.romanToInt(s);
        assertEquals(1994,output);
    }

}