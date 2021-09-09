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
class ArithmeticFunction {
  public static int arithmetic(int a, int b, String operator) {
     switch (operator){
         case "add":
             return a+b;
         case "subtract":
             return a-b;
         case "divide":
             return a/b;
         case "multiply":
             return a*b;
     }
     return 0;
  }
}
