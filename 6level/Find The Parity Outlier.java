package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
        
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class FindOutlier{
  static int find(int[] integers){
  int mod = 0,evencount=0,oddcount=0;
  for(int i=0;i<integers.length;i++){
      if(integers[i]%2==0){
          evencount++;
      }
      else{
          oddcount++;
      }
  }
  if(evencount<oddcount){
      mod=1;
  }
  for(int i=0;i<integers.length;i++){
      if(mod==0){
        if(integers[i]%2==0){
          
        }
        else{
          return integers[i];
        } 
      }
      else{
        if(integers[i]%2==0){
          return integers[i];
        }
        else{
          
        }   
      }
      
  }
  return 0;
}}
