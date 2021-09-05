package katatemplateproject;
import java.util.*;
import java.util.regex.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        Bio b = new Bio();
        prnt(b.dnaToRna("GCAU"));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Bio {
    public String dnaToRna(String dna) {
            String s = "";
            for(int i=0;i<dna.length();i++){
            if(dna.charAt(i)=='T'){
                s += 'U';
            }
            else if(dna.charAt(i)=='U'){
                s +='T';
            }
            else{
                s += dna.charAt(i);
            }
        }
            return s;
    } 
}
