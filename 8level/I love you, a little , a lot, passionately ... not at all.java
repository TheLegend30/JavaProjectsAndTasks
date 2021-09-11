package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Sid {
    public static String howMuchILoveYou(int nb_petals) {
    while(nb_petals>6){
        nb_petals-=6;
    }    
    switch(nb_petals){
        case 1:
            return "I love you";
        case 2:
            return "a little";
        case 3:
            return "a lot";
        case 4:
            return "passionately";
        case 5:
            return "madly";
        default:
            return "not at all";    
    }
    }
}
