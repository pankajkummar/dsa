package com.pankaj.dsa.util;

public class ArrayPrinter {
    public void printArrayInt(int[][] arr){
        int r= arr.length;;
        int c= arr[0].length;
        System.out.println("***********************************");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }
        System.out.println("***********************************");
    }
    public void printArrayChar(char[][] arr){
        int r= arr.length;;
        int c= arr[0].length;
        System.out.println("***********************************");
        for (char[] chars : arr) {
            for (int j = 0; j < c; j++) {
                System.out.print(chars[j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("***********************************");

    }
}
