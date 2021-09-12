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
class Ascii {
  public static char getChar(int c) {
      return (char)c;
  }
}
