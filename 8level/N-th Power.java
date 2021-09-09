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
  public static int nthPower(int[] array, int n) {
    if(n>=array.length){
        return -1;
    }
    else{
        return (int)Math.pow(array[n], n);
    }
  }
}
