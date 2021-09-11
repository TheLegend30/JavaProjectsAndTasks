package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(DRoot.digital_root(129));
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class DRoot {
  public static int digital_root(int n) {
    String[] str = Integer.toString(n).split("");  
    int sum;
    if(n>=10){
        do{
            sum=0;
            for(int i=0;i<str.length;i++){
                sum+=Integer.parseInt(str[i]);              
            }str=Integer.toString(sum).split("");
        }while(sum>=10);
        
    }
    else{
        return n;
    }
    return sum;
  }
}
