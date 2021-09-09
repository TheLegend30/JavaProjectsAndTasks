package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Solution.toCamelCase("the-stealth-warrior"));
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Solution{

  static String toCamelCase(String s){
    String[] buffer = s.split("_|-");
    String result ="";
    for(int i=0;i<buffer.length;i++){
        if(i!=0){
            buffer[i] = buffer[i].substring(0, 1).toUpperCase() + buffer[i].substring(1);
        }
        result+=buffer[i];
    }
    return result;
  }
}
