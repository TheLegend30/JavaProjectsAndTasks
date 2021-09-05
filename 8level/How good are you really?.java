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
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
     int sum=0;
     for(int s:classPoints){
         sum+=s;
     }
     if(yourPoints>sum/classPoints.length){
         return true;
     }
     else{
         return false;
     }
  }
}
