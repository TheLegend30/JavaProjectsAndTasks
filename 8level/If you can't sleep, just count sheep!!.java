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
  public static String countingSheep(int num) {
    String result = "";
    for(int i=1;i<=num;i++){
        result+=i+" sheep...";
    }
    return result;
  }
}
