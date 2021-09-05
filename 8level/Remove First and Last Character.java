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
class RemoveChars {
    public static String remove(String str) {
       StringBuilder strbuild = new StringBuilder();
       strbuild.append(str);
       return strbuild.replace(0, 1, "").replace(str.length()-2, str.length()-1, "").toString();
    }
}
