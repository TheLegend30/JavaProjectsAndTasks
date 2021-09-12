package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(NoBoring.noBoringZeros(-1050));
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Solution {
  public static String camelCase(String input) {
      String result="";
    for(int i=0;i<input.length();i++){
        if(i!=0 & Character.isUpperCase(input.charAt(i))){
            result+=" " + input.charAt(i);
        }
        else{
            result+=input.charAt(i);
        }
    }  
    return result;
  }
}
