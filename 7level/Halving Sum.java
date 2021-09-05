package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
       prnt(HalvingSum.halvingSum(25));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class HalvingSum {
  public static int halvingSum(int n) {
    int result=n;
    while(n!=1){
        n=n/2;
        result+=n;
    }
    return result;
  }
}
