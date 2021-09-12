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
class Kata {
    public static String multiTable(int num) {
        String result ="";
        for(int i=1;i<=10;i++){
            result+=i + " * " + num + " = " + (num*i);
            if(i!=10){
              result+="\n";  
            }
        }
        return result;
    }
}
