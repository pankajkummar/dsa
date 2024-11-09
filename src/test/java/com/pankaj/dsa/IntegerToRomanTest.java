package com.pankaj.dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {
    private IntegerToRoman integerToRoman;

    @BeforeEach
    void createInstance(){
        integerToRoman = new IntegerToRoman();
    }

    @Test
    void intToRomanTest1() {
        int num=3749;
        String output = integerToRoman.intToRoman(num);
        assertEquals("MMMDCCXLIX",output);
    }
    @Test
    void intToRomanTest2() {
        int num=58;
        String output = integerToRoman.intToRoman(num);
        assertEquals("LVIII",output);
    }
    @Test
    void intToRomanTest3() {
        int num=1994;
        String output = integerToRoman.intToRoman(num);
        assertEquals("MCMXCIV",output);
    }
}