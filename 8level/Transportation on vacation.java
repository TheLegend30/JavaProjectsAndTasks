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
  public static int rentalCarCost(int d) {
     if(d>=7){
         return ((d*40)-50);
     }
     else if(d>=3){
          return ((d*40)-20);
     }
     else{
         return d*40;
     }
  }
}
