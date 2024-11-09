package com.pankaj.dsa;
/*
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

The algorithm for myAtoi(string s) is as follows:

Whitespace: Ignore any leading whitespace (" ").
Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
Return the integer as the final result.
 */
public class StringToInteger {
    public int myAtoi(String s){
        int i=0;
        int num=0;
        boolean gotNumFlag=false;
        boolean isNegative= false;
        boolean gotPosFlag = false;
        while(i<s.length()){

            if(Character.isWhitespace(s.charAt(i)) && !gotNumFlag){
                i++;
            }else if(Character.isDigit(s.charAt(i))){
                if (num > (Integer.MAX_VALUE - Character.getNumericValue(s.charAt(i))) / 10) {
                    if(isNegative){
                        return Integer.MIN_VALUE;
                    }else{
                        return Integer.MAX_VALUE;
                    }

                }
                num = num*10+Character.getNumericValue(s.charAt(i));
                gotNumFlag=true;
                i++;
            } else if (s.charAt(i)=='-' && !gotNumFlag) {
                isNegative= true;
                gotNumFlag=true;
                i++;
            }
            else if (s.charAt(i)=='+' && !gotNumFlag) {
                gotNumFlag=true;
              //  gotPosFlag=true;
                i++;
            }else if (!Character.isDigit(s.charAt(i))){
                break;
            }
        }

     return isNegative ? num*-1 :  num;
    }
}
