package katatemplateproject;
import java.util.*;
import java.util.regex.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(StringUtils.toAlternativeString("1A2B3C4D5E"));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}

class StringUtils {
  
  public static String toAlternativeString(String string) {
      String result = ""; 
      for(int i=0;i<string.length();i++){
          if(Character.isUpperCase(string.charAt(i))){
              result += Character.toLowerCase(string.charAt(i));
          }
          else{
              result += Character.toUpperCase(string.charAt(i)); 
          }
      }
      return result;
  }
}
