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
class FindDivisor {

  public long numberOfDivisors(int n) {
     if(n==0){
         return 0;
     }
     int counter=1;
     for(int i=n;i>1;i--){
         if(n%i==0){
             counter++;
         }
     }
     return counter;
  }

}
