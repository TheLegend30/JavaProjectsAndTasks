package katatemplateproject;
import java.util.*;
import java.util.regex.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Kata.dontGiveMeFive(1, 16));
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Solution {
    public static int areaOrPerimeter (int l, int w) {
        if(l==w){
            return l*w;
        }
        else{
            return (l+w)*2;
        }
    }
}
