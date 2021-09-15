package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Kata.TripleDouble(1222345, 12345));        
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
    
}
class Kata
{
  public static int TripleDouble(long num1, long num2) 
  {
    String[] splnum1 = String.valueOf(num1).split("");
    String[] splnum2 = String.valueOf(num2).split("");
    int buffer = 0;
    for(int i = 0;i<splnum1.length;i++){
        if(i>=splnum1.length-3){
            return 0;
        }
        if(Integer.parseInt(splnum1[i])==Integer.parseInt(splnum1[i+1])){
            if(Integer.parseInt(splnum1[i])==Integer.parseInt(splnum1[i+2])){
                buffer = Integer.parseInt(splnum1[i]);
                break;
            }
        }
    }
    for(int i=0;i<splnum2.length;i++){
        if(Integer.parseInt(splnum2[i])==buffer){
            if(Integer.parseInt(splnum2[i+1])==buffer){
                return 1;
            }
        }
    }
    return 0;
  }
}
