package com.pankaj.dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingTest {
    private RegularExpressionMatching regularExpressionMatching;

    @BeforeEach
    void createInstance(){
        regularExpressionMatching = new RegularExpressionMatching();
    }

    @Test
    void isMatchTest1() {
        String s ="aa";
        String pattern = "a";
        boolean result = regularExpressionMatching.isMatch(s,pattern);
        assertEquals(false,result);
    }
    @Test
    void isMatchTest2() {
        String s ="aa";
        String pattern = "a*";
        boolean result = regularExpressionMatching.isMatch(s,pattern);
        assertEquals(true,result);
    }
    @Test
    void isMatchTest3() {
        String s ="aabb";
        String pattern = "a*b*";
        boolean result = regularExpressionMatching.isMatch(s,pattern);
        assertEquals(true,result);
    }
    @Test
    void isMatchTest4() {
        String s ="ab";
        String pattern = ".*";
        boolean result = regularExpressionMatching.isMatch(s,pattern);
        assertEquals(true,result);
    }
    @Test
    void isMatchTest5() {
        String s ="aab";
        String pattern = "c*a*b";
        boolean result = regularExpressionMatching.isMatch(s,pattern);
        assertEquals(true,result);
    }
    @Test
    void isMatchTest6() {
        String s ="aaa";
        String pattern = "ab*a*c*a";
        boolean result = regularExpressionMatching.isMatch(s,pattern);
        assertEquals(true,result);
    }


}