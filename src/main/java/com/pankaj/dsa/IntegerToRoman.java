package com.pankaj.dsa;

public class IntegerToRoman {
    public String intToRoman(int num) {
        int [] value = {1,4,5,9,10,40,50,90,100,400,500,900,1000,5000};
        String [] symbol = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        StringBuilder roman = new StringBuilder();
        while(num>0){
            for(int i=0; i<value.length; i++) {
                if(num<value[i]){
                    roman.append(symbol[i-1]);
                    num=num-value[i-1];
                    break;
                }

            }
        }
        return roman.toString();

    }

}
