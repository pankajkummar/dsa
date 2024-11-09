package com.pankaj.dsa;

import com.github.freva.asciitable.AsciiTable;
import com.pankaj.dsa.util.ArrayPrinter;

/*
* test case 1 babad
* */
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int[][] arr =new int[s.length()][s.length()];
        char[] str = s.toCharArray();
        int maxLength=1;
        int start=0;
        ArrayPrinter arrayPrinter = new ArrayPrinter();
        for(int i=0; i<s.length(); i++){
            arr[i][i]=1;
        }
        for(int i=0; i<s.length()-1;i++){
            if(str[i]==str[i+1]){
                arr[i][i+1]=1;
                start=i;
                maxLength=2;
            }
        }

            for(int length=3; length<=s.length(); length++) {
                for(int i=0; i<s.length()-length+1; i++) {
                    int j = i+length-1;

                    if (str[i] == str[j] && arr[i + 1][j - 1] == 1) {
                        arr[i][j] = 1;
                        start = i;
                        maxLength = length;
                    }
                }
            }



     arrayPrinter.printArrayInt(arr);
     return s.substring(start,start+maxLength);
    }
}