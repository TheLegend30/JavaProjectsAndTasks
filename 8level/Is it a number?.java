package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        Float.parseFloat("2.22s");
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class MyUtilities{

  public boolean isDigit(String s){
      try{
          Float.parseFloat(s);
      }
      catch(NumberFormatException ex){
         return false;
      }
      return true;
  }
}
