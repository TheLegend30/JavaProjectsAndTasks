package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Maps {
  public static int[] map(int[] arr) {
      int[] a=new int[arr.length];
      for(int i=0;i<arr.length;i++){
          a[i]=arr[i]*2;
      }
      return a;
  }
}
