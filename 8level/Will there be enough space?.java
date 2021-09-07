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
class Bob {
  public static int enough(int cap, int on, int wait){
      if((on+wait)>cap){
          return -1*(cap-(on+wait));
      }
      return 0;
  }
}
