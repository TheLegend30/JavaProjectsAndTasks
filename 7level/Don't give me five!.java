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
class Kata
{
  public static int dontGiveMeFive(int start, int end)
  {
    int sum=0;
    int mod=1;
    String buffer = "";
    for(int i=start;i<=end;i++){
        buffer=String.valueOf(i);
        mod=1;
        for(int j=0;j<buffer.length();j++){
            if(buffer.charAt(j)=='5'){
                mod=0;
                continue;               
            }           
        }
        sum+=mod;
    }
    return sum;
  }
}
