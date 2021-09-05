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
class BasicOperations
{
  public static Integer basicMath(String op, int v1, int v2)
  {
     switch (op){
         case "+":
             return v1+v2;
         case "-":
             return v1-v2;
         case "*":
             return v1*v2;
         case "/":
             return v1/v2;
     }
     return null;
  }
}
