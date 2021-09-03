package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}

class Positive{

  public static int sum(int[] arr){
    int sum=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>=0){
            sum+=arr[i];
        }
    }
    return sum;
  }

}
