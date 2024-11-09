package com.pankaj.dsa;

import com.pankaj.dsa.util.ArrayPrinter;

public class ZigzagConversion {
    public String convert(String s, int numRows){
        char[][] charArray = new char[numRows][s.length()];
        StringBuilder result = new StringBuilder();
       // ArrayPrinter arrayPrinter = new ArrayPrinter();
        int i=0,j=0,length=0;
        if(s.length()<=2 || numRows<2){
            return s;
        }
        else {
            while (length < s.length()) {

                //go down
                if (i == 0) {
                    while (i < numRows - 1 && length < s.length()) {
                        charArray[i][j] = s.charAt(length);
                        length++;
                        i++;
                    }
                }
                //go up
                if (i == numRows - 1) {
                    while (i > 0 && length < s.length()) {

                        charArray[i][j] = s.charAt(length);
                        i = i - 1;
                        j = j + 1;
                        length++;
                    }

                }
            }
          //  arrayPrinter.printArrayChar(charArray);
            for (int l = 0; l < numRows; l++) {
                for (int m = 0; m < s.length(); m++) {
                    if (charArray[l][m] != '\u0000') {
                        result.append(charArray[l][m]);

                    }
                }
            }
        }
        return result.toString();
    }
}
