package com.pankaj.dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    private PalindromeNumber palindromeNumber;

    @BeforeEach
    void createInstance(){
        palindromeNumber = new PalindromeNumber();
    }

    @Test
    void isPalindromeTest1() {
        int x = 121;
        boolean result = palindromeNumber.isPalindrome(x);
        assertEquals(true,result);
    }
    @Test
    void isPalindromeTest2() {
        int x = -121;
        boolean result = palindromeNumber.isPalindrome(x);
        assertEquals(false,result);
    }
    @Test
    void isPalindromeTest3() {
        int x = 10;
        boolean result = palindromeNumber.isPalindrome(x);
        assertEquals(false,result);
    }
    @Test
    void isPalindromeTest4() {
        int x = 1221;
        boolean result = palindromeNumber.isPalindrome(x);
        assertEquals(true,result);
    }
}