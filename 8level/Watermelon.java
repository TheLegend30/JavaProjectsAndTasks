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
class Kata {
  
  public static boolean divide(int weight) {
    if(weight%2==0 & weight!=2){
        return true;
    }
    return false;
  }
}
