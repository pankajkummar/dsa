package com.pankaj.dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {
    private MedianOfTwoSortedArrays medianOfTwoSortedArrays;

    @BeforeEach
    void createInstance() {
        medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();

    }

    @Test
    void findMedianSortedArraysTest1() {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double result = medianOfTwoSortedArrays.findMedianSortedArrays(nums1,nums2);
        assertEquals(2.000,result,0.0001);
    }
    @Test
    void findMedianSortedArraysTest2() {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        double result = medianOfTwoSortedArrays.findMedianSortedArrays(nums1,nums2);
        assertEquals(2.500,result,0.0001);
    }
    @Test
    void findMedianSortedArraysTest3() {
        int[] nums1 = {};
        int[] nums2 = {3,4};
        double result = medianOfTwoSortedArrays.findMedianSortedArrays(nums1,nums2);
        assertEquals(3.500,result,0.0001);
    }
    @Test
    void findMedianSortedArraysTest4() {
        int[] nums1 = {1,2,5};
        int[] nums2 = {};
        double result = medianOfTwoSortedArrays.findMedianSortedArrays(nums1,nums2);
        assertEquals(2.000,result,0.0001);
    }
    @Test
    void findMedianSortedArraysTest5() {
        int[] nums1 = {1,2,5,5,6,7};
        int[] nums2 = {3};
        double result = medianOfTwoSortedArrays.findMedianSortedArrays(nums1,nums2);
        assertEquals(5.000,result,0.0001);
    }
}