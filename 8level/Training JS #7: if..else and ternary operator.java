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
class SaleHotdogs{
  public static int saleHotdogs(final int n){
    if(n<5){
        return n*100;
    }
    else if(n>=5 & n<10){
        return n*95;
    }
    else{
        return n*90;
    }
  }
}
