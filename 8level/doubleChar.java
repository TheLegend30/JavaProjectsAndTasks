package com.company;

public class Main{
    public static void main(String[] args){
        System.out.println(Solution.doubleChar("Katya"));
    }
}
class Solution{
    public static String doubleChar(String s){
        String result = "";
        for(char i : s.toCharArray()){
            result +=i;
            result +=i;
        }
        return result;
    }
}
