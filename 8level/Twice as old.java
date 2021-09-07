package katatemplateproject;
import java.util.*;
import java.util.regex.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class TwiceAsOld{

  public static int TwiceAsOld(int dadYears, int sonYears){
     if((sonYears*2)>=dadYears){
         return (sonYears*2)-dadYears;
     }
     else{
         return dadYears-(sonYears*2);
     }
  
  }

}
