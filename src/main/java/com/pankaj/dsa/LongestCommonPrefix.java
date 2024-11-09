package com.pankaj.dsa;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder s = new StringBuilder();
        for(int i=0; i<strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            Boolean b = true;
            for (String str : strs) {
                if(i>str.length()-1)
                {
                    b=false;
                    break;
                }
                if(str.charAt(i)==c){

                }
                else{
                    b=false;
                    break;
                }

            }
            if(b){
                s.append(c);
            }
            else{
                break;
            }
        }
        return s.toString();
    }
}
