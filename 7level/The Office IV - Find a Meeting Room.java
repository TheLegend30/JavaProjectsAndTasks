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
class TheOffice {
  public static Object meeting(char[] x) {
    for(int i=0;i<x.length;i++){
        if(x[i]=='O'){
            return i;
        }
    }
    return "None available!";
  }
}
