package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(NoBoring.noBoringZeros(-1050));
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Kata {
  public static String tripleTrouble(String one, String two, String three) {
    String result="";
    for(int i=0;i<one.length();i++){
        result+=one.charAt(i);
        result+=two.charAt(i);
        result+=three.charAt(i);
    }
    return result;
  }
}
