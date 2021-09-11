package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Kata.findMissingLetter(new char[] { 'a','b','c','d','f' }));
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Kata
{
  public static char findMissingLetter(char[] array)
  {
    for(int i=0;i<array.length;i++){
        if(array[i]!=array[i+1]-1){
            return (char)(array[i]+1);
        }
    }  
    return ' ';
  }
}
