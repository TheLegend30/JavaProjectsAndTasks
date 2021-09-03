package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Troll.disemvowel("ffsf feraaaaiuoe"));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("[aAeEiIoOuU]", "");
    }
}
