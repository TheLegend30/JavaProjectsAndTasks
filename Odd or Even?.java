package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}

class Codewars {
  public static String oddOrEven (int[] array) {
     int sum = 0;
     for(int i:array){
         sum+=i;
     }
     if(sum%2==0){
         return "even";
     }
     else{
         return "odd";
     }
  }
}
