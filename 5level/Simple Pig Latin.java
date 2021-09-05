package katatemplateproject;
import java.util.*;
import java.util.regex.*;
public class KataTemplateProject {
    public static void main(String[] args) {
       prnt(PigLatin.pigIt("Hello world !"));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class PigLatin {
    public static String pigIt(String str) {
        String[] splitstr = str.split(" ");
        for(int i=0;i<splitstr.length;i++){
            splitstr[i] = splitstr[i].substring(1)+splitstr[i].charAt(0);
        }
        String result ="";
        for(int i=0;i<splitstr.length;i++){
            if(Pattern.matches("\\p{Punct}", splitstr[i])){
                result+=splitstr[i];
            }
            else{
                result+=splitstr[i]+"ay";
            }
            if(i!=splitstr.length-1){
                result+=" ";
            }
        }
        return result;
    }
}
