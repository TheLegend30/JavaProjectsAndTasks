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
class SumArray {

  public static double sum(double[] numbers) {
    double sum = 0.0;
    for(double item:numbers){
        sum+=item;
    }
    return sum;
  }
}
