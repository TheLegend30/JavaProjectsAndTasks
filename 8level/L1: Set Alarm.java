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
class Alarm {
  
  public static boolean setAlarm(boolean employed, boolean vacation) {
      if(employed){
          if(vacation){
              return false;
          }
          else{
              return true;
          }
      }
      else{
          return false;
      }
  }

}
