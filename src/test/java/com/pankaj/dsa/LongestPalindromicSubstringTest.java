package com.pankaj.dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {
    private LongestPalindromicSubstring longestPalindromicSubstring;

    @BeforeEach
    void createInstance(){
        longestPalindromicSubstring = new LongestPalindromicSubstring();
    }

    @Test
    void longestPalindromeTest1() {
        String s="babad";
        String solution = longestPalindromicSubstring.longestPalindrome(s);
        assertTrue(Objects.equals(solution, "bab") || Objects.equals(solution, "aba"));
    }
    @Test
    void longestPalindromeTest2() {
        String s="cbbd";
        String solution = longestPalindromicSubstring.longestPalindrome(s);
        assertEquals("bb", solution);
    }
    @Test
    void longestPalindromeTest3() {
        String s="aacbbcaa";
        String solution = longestPalindromicSubstring.longestPalindrome(s);
        assertEquals("aacbbcaa", solution);
    }
    @Test
    void longestPalindromeTest4() {
        String s="aaaaaaaaaaaaacbbbbbbbbbbbbbbbbbbbbddddddddd3334raaaaaaaaaaaaaaaaaaa";
        String solution = longestPalindromicSubstring.longestPalindrome(s);
        assertEquals("bbbbbbbbbbbbbbbbbbbb", solution);
    }
    @Test
    void longestPalindromeTest5() {
        String s="caaaac";
        String solution = longestPalindromicSubstring.longestPalindrome(s);
        assertEquals("caaaac", solution);
    }
}