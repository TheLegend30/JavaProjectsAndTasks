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
class Solution {
    static String removeExclamationMarks(String s) {
        return s.replace("!", "");
    }
}
