package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
     int sum=0;
     for(int i=0;i<arr1.length;i++){
         sum+=arr1[i];
     }
     for(int i=0;i<arr2.length;i++){
         sum+=arr2[i];
     }
     return sum;
  }

}
