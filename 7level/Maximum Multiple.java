package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
    
}
class MaxMultiple {
  public static int maxMultiple(int divisor, int bound) {
    for(int i=bound;i>=divisor;i--){
        if(i%divisor==0){
            return i;
        }
    }
    return 0;
  }
}
