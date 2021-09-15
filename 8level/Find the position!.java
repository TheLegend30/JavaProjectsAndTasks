package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Kata.position('A'));
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
    
}
class Kata
{
  public static String position(char alphabet)
  {  
    return "Position of alphabet: "+ ((int)Character.toLowerCase(alphabet)-96);
  }
}
