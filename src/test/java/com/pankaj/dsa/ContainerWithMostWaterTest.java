package com.pankaj.dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    private ContainerWithMostWater containerWithMostWater;

    @BeforeEach
    void createInstance(){
        containerWithMostWater = new ContainerWithMostWater();

    }

    @Test
    void maxAreaTest1() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = containerWithMostWater.maxArea(height);
        assertEquals(49,result);
    }

    @Test
    void maxAreaTest2() {
        int[] height = {1, 1};
        int result = containerWithMostWater.maxArea(height);
        assertEquals(1,result);
    }

    @Test
    void maxAreaTest3() {
        int[] height = {1, 1};
        int result = containerWithMostWater.maxArea(height);
        assertEquals(1,result);
    }

    @Test
    void maxAreaTest4() {
        int[] height = {1, 1};
        int result = containerWithMostWater.maxArea(height);
        assertEquals(1,result);
    }
}