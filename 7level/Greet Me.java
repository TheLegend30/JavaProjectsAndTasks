package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
        
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
    
}
class GreetMe{
  public static String greet(String name){
    return "Hello " + Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase()+"!";
  }
}
