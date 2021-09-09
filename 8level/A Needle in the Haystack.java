package katatemplateproject;
import java.util.*;
import java.util.regex.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Kata {
  public static String findNeedle(Object[] haystack) {
     for(int i=0;i<haystack.length;i++){
         if(haystack[i]=="needle"){
             return "found the needle at position "+i;
         }
     }
     return null;
     
  }
}
