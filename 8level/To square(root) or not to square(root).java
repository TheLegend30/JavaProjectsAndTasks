package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
        for(int item:Kata.squareOrSquareRoot(new int[] { 2, 9, 3, 49, 4, 1 })){
            prnt(item);
        }
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Kata
{
  public static int[] squareOrSquareRoot(int[] array)
  {
    int[] result = new int[array.length];
    for(int i=0;i<array.length;i++){
        if(Math.sqrt(array[i])==Math.round(Math.sqrt(array[i]))){
           result[i]=(int)Math.sqrt(array[i]);
        }
        else{
           result[i]=(int)Math.pow(array[i], 2);
        }
    }
    return result;
  }
}
