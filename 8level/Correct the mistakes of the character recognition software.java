package katatemplateproject;
import java.util.*;
import java.util.regex.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Kata.greet("Michael", "Michael"));
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Correct {
  public static String correct(String string) {
    return string.replace("5", "S").replace("0","O").replace("1","I");
  }
}
