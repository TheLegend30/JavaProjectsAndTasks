package katatemplateproject;

import java.util.*;
public class KataTemplateProject
{
    public static void main(String[] args) {
        System.out.println(Solution.capitalize("codewarriors", new int[]{5}));
    }
}

class Solution{
    public static String capitalize(String s, int[] ind){
        String result ="";
        for(int i=0,j=0;i<s.length();i++){
            if(i==ind[j]){
                result+=Character.toUpperCase(s.charAt(i));
                if(j<ind.length-1){
                  j++;  
                }
                
            }
            else{
                result+=s.charAt(i);
            }
        }
        return result;
    }
}
