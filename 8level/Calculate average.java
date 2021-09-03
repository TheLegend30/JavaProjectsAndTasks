package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}

class Kata{
  public static double find_average(int[] array){
     double average=0;
     for(int i=0;i<array.length;i++){
         average+=array[i];
     }
     return (average/array.length);
  }
}
