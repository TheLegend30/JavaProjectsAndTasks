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
class EvenOrOdd {
    public static String even_or_odd(int number) {
        if(number%2==0){
            return "Even";
        }
        else{
            return "Odd";
        }
        
    }
}
