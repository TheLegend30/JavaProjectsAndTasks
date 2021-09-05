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
class ReverseWords{

 public static String reverseWords(String str){
     ArrayDeque<String> ar= new ArrayDeque<String>();
     String[] strnew = str.split(" ");
     for(String s:strnew){
         ar.addFirst(s);
     }
     return ar.toString().replace(", ", " ").replace("[","").replace("]","");
 }
}
