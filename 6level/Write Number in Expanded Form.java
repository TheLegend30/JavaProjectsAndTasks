package katatemplateproject;
import java.util.*;
import java.util.regex.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Kata.expandedForm(1));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Kata
{
    public static String expandedForm(int num)
    {
      String[] s = String.valueOf(num).split("");
      if(s.length<2){
          return String.valueOf(num);
      }
      int digits=s.length;
      String result="";
      int temp = 0;
      for(int i=digits-1,j=0;i>=0;i--,j++){
          temp = Integer.parseInt(s[j]);
          if(temp>0){
              if(i!=0){
                  result+=(int)(temp*Math.pow(10, i)) + " + ";
              }
              else{
                  result+=(int)(temp*Math.pow(10, i));
              }
          }
      }
      if(" + ".equals(result.substring(result.length()-3))){
          return result.substring(0, result.length()-3);
      }
      else{
          return result;   
      }

    }
}
