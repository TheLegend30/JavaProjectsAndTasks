package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Solution {
    public static String repeatStr(final int repeat, final String string) {
        String s = "";
        for(int i=0;i<repeat;i++){
            s+=string;
        }
        return s;
    }
}
