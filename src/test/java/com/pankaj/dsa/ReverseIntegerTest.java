package com.pankaj.dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {
    private ReverseInteger reverseInteger;
    @BeforeEach
    void createInstance(){
        reverseInteger = new ReverseInteger();
    }


    @Test
    void reverseTest1() {
        int x = 123;
        int result = reverseInteger.reverse(x);
        assertEquals(321,result);
    }

    @Test
    void reverseTest2() {
        int x = -123;
        int result = reverseInteger.reverse(x);
        assertEquals(-321,result);
    }

    @Test
    void reverseTest3() {
        int x = 120;
        int result = reverseInteger.reverse(x);
        assertEquals(21,result);
    }
}