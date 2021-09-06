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
class Kata {

  public static boolean feast(String beast, String dish) {
    
    return ((beast.charAt(0)==dish.charAt(0))&(beast.charAt(beast.length()-1)==dish.charAt(dish.length()-1)));
    
  }
  
}
  
