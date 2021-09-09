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
    public static int quarterOf(int month) {
        int result=1;
        while(month>3){
            month-=3;
            result++;
        }
        return result;
    }
}
