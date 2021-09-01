package katatemplateproject;
 
import java.util.Arrays;

public class KataTemplateProject {
    public static void main(String[] args) {
       prnt(AngleSum.sumOfAngles(4));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}

class AngleSum {
  public static int sumOfAngles(int n) {
      return 180*(n-2);
  }
}
