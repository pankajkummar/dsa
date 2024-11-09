package com.pankaj.dsa;

public class PalindromeNumber {
    public boolean isPalindrome(int x){
        int reversed=0;
        int copy=x;
        if(x<0){
            return false;
        }
        else {
            while(x!=0){
                int digit = x%10;
                x=x/10;
                reversed = reversed*10 +digit;
            }
            if(reversed==copy){
                return true;
            }
            else return false;
        }

    }

}
