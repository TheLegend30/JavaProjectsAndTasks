package katatemplateproject;
 
import java.util.Arrays;

public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Kata.simpleTransposition("Simple text"));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Kata {
    public static String simpleTransposition(String text) {
        String row1="";
        String row2="";
        char[] ch=text.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(i%2==0){
                row1+=ch[i];
            }
            else{
                row2+=ch[i];
            }
        }
        return row1+row2;
    }
}
