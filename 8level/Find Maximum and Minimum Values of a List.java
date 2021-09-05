package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Kata {

  public int min(int[] list) {
    int buffer=list[0];
    for(int i:list){
        if(buffer>i){
            buffer=i;
        }
    }
    return buffer;
  }
  
  public int max(int[] list) {
   int buffer=list[0];
    for(int i:list){
        if(buffer<i){
            buffer=i;
        }
    }
    return buffer;
  }
}
