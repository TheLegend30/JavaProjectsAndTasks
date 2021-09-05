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
class Kata{
  public static String bonusTime(final int salary, final boolean bonus) {
     if(bonus){
         return "£"+String.valueOf(salary*10);
     }
     else{
         return "£"+String.valueOf(salary);
     }
  }
}
