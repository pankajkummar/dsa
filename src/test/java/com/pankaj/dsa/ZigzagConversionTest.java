package com.pankaj.dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigzagConversionTest {
    private ZigzagConversion zigzagConversion;
    @BeforeEach
    void createInstance(){
        zigzagConversion = new ZigzagConversion();
    }

    @Test
    void convertTest1() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String result = zigzagConversion.convert(s,numRows);
        assertEquals("PAHNAPLSIIGYIR",result, "got result "+result);
    }
    @Test
    void convertTest2() {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String result = zigzagConversion.convert(s,numRows);
        assertEquals("PINALSIGYAHRPI",result,"got result "+result);
    }
    @Test
    void convertTest3() {
        String s = "A";
        int numRows = 1;
        String result = zigzagConversion.convert(s,numRows);
        assertEquals("A",result,"got result "+result);
    }
}