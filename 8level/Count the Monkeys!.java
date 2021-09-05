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
class MonkeyCounter
{
  public static int[] monkeyCount(final int n){
      int[] result = new int[n];
      for(int i=1;i<=n;i++){
          result[i-1]=i;
      }
      return result;
  }
}
