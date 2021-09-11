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
class CodeWars {
  public static int strCount(String str, char letter) {
    int result=0;
    for(int i=0; i<str.length();i++){
        if(str.charAt(i)==letter){
            result++;
        }
    }
    return result;
  }
}
