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
  public static long[] powersOfTwo(int n){
    long[] result = new long[n+1];
    for(int i=0;i<=n;i++){
        result[i]=(long)Math.pow(2, i);
    }
    return result;
  }
}
