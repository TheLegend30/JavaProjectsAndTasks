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

  public static int oddCount(int n){
    int counter=0;
    while(n>1){
        n-=2;
        counter++;
    }
    return counter;
  }

}
