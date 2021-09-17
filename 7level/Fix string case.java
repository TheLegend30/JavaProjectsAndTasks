package katatemplateproject;

import java.util.*;

public class KataTemplateProject {
    public static void main(String[] args) {

    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
    
}
class Solution {
    public static String solve(final String str) {
        int counterL=0;
        int counterU=0;
        for(char i:str.toCharArray()){
            if(Character.isUpperCase(i)){
                counterU++;
            }
            else{
                counterL++;
            }
        }
        if(counterU>counterL){
            return str.toUpperCase();
        }
        return str.toLowerCase(); 
    }
}
