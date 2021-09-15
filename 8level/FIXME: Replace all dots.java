package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Dinglemouse.replaceDots("one.two.three"));
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
    
}
class Dinglemouse {

  public static String replaceDots(final String str) {
    return str.replace(".", "-");
  }
  
}
