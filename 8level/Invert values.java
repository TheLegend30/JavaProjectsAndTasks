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
  public static int[] invert(int[] array) {
     if(array.length==0){
         return array;
     }
     for(int i=0;i<array.length;i++){
         array[i]*=-1;
     }
     return array;
  
  }
}
