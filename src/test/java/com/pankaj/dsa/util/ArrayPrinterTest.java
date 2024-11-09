package com.pankaj.dsa.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayPrinterTest {

    @Test
    void printArrayInt() {
        ArrayPrinter arrayPrinter = new ArrayPrinter();
        int[][] arr = {{1,2,3},{4,5,6}};
        arrayPrinter.printArrayInt(arr);
        assertSame("a", "a");
    }
}