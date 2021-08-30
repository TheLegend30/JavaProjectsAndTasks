package katatemplateproject;
import java.util.*;
 
public class KataTemplateProject {
    public static void main(String[] args) {    
       String result = Kata.highAndLow("1 9 3 4 -5");
       System.out.println(result);
    }
}

class Kata {
  public static String highAndLow(String numbers) {
    String[] s = numbers.split(" ");
    int[] arr = new int[s.length];
    for(int i=0;i<s.length;i++){
        arr[i]=Integer.parseInt(s[i]);
    }
    int max=arr[0],min=arr[0];
    for(int i=0;i<s.length;i++){
        for(int j=1;j<s.length;j++){
            if(max<arr[j]){
                max=arr[j];
            }
            if(min>arr[j]){
                min=arr[j];
            }
        }
    }
    return max + " " + min;
  }
}
