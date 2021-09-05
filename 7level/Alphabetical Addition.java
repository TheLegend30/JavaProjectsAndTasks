package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Kata.addLetters("y","a"));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Kata {

    public static String addLetters(String... letters) {
        if(letters.length==0){
            return "z";
        }
        int result=0;
        for(int i=0;i<letters.length;i++){
            result += letters[i].charAt(0)-96;
        }
        while(result+96>122){
            result-=26;
        }
        return String.valueOf((char)(result+96));
    }

}
