package katatemplateproject;
import java.util.*;
import java.util.regex.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Kata.greet("Michael", "Michael"));
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Kata {
    static String greet(String name, String owner) {
        if(name.equals(owner)){
            return "Hello boss";
        }
        else{
            return "Hello guest";
        }
    }
}
