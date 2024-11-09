package com.pankaj.dsa;

public class RomanToInteger {
    public int romanToInt(String s) {
        int [] value = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String [] symbol = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int num=0;
        int k=0;
        while(k<s.length()){
            for(int i=symbol.length-1;i>=0; i--){
                if(symbol[i].length()<=s.length()-k) {
                    if (symbol[i].equals(s.substring(k, k + symbol[i].length()))) {
                        num = num + value[i];
                        k = k + symbol[i].length();
                        break;

                    }
                }
            }
        }


        return num;
    }
}
