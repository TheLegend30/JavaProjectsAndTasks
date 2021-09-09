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
class EvenNumbers {
  public static int[] divisibleBy(int[] numbers, int divider) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      for(int i=0;i<numbers.length;i++){
          if(numbers[i]%divider==0){
              list.add(numbers[i]);
          }
      }
      int[] result = new int[list.size()];
      for(int i=0;i<list.size();i++){
          result[i]=list.get(i);
      }
      return result;
  }
}
