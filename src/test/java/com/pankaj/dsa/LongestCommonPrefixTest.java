package com.pankaj.dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    private LongestCommonPrefix longestCommonPrefix;

    @BeforeEach
    void setUp() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    void longestCommonPrefixTest1() {
        String[] strs = {"flower","flow","flight"};
        String output = longestCommonPrefix.longestCommonPrefix(strs);
        assertEquals("fl",output);
    }
    @Test
    void longestCommonPrefixTest2() {
        String[] strs = {"dog","racecar","car"};
        String output = longestCommonPrefix.longestCommonPrefix(strs);
        assertEquals("",output);
    }
    @Test
    void longestCommonPrefixTest3() {
        String[] strs = {"flower","fl","floight"};
        String output = longestCommonPrefix.longestCommonPrefix(strs);
        assertEquals("fl",output);
    }
}