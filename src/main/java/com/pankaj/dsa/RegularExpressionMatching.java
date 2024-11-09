package com.pankaj.dsa;

import java.util.Objects;

public class RegularExpressionMatching {
    public boolean isMatch(String s, String p){
        if(Objects.equals(p, ".*")){
            return true;
        }
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        dp[0][0] = true;

        //matching empty string
        for(int j=2; j<=p.length(); j++){
            if(p.charAt(j-1) == '*'){
               dp[0][j] = dp[0][j - 2];
            }
        }
        // fill the dp table

        for(int i=1;i<=s.length();i++){
            for(int j=1; j<=p.length(); j++){
                if(p.charAt(j-1)== '*') {
                    dp[i][j] = dp[i][j-2] || ((p.charAt(j-2) == '.' || p.charAt(j-2) == s.charAt(i-1)) && dp[i-1][j]);
                }else{
                    dp[i][j] = (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1)) && dp[i - 1][j - 1];
                }

            }
        }

        return dp[s.length()][p.length()];
    }
}
