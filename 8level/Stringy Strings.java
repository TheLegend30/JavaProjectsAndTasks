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
  public static String stringy(int size) {
     String result = "";
     for(int i=1;i<=size;i++){
         if(i%2==0){
             result+=0;
         }
         else{
             result+=1;
         }
     }
     return result;
  }
}
