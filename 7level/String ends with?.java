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
  public static boolean solution(String str, String ending) {
    if(ending.length()>str.length()){
        return false;
    }  
    return (str.substring((str.length()-ending.length())).equals(ending));
  }
}
