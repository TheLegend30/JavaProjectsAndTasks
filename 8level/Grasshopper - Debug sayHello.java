package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(PangramChecker.check("The quick brown fox jumps over the lazy dog."));
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class PangramChecker {
  public static boolean check(String sentence){
    TreeSet<Character> ts = new TreeSet<Character>();
    sentence=sentence.toLowerCase();
    char[] chars = sentence.toCharArray();
    for(char ch:chars){
        if(Character.isAlphabetic(ch)){
            ts.add(ch);
        }
    }
    return (ts.size()==26);
  }
}
