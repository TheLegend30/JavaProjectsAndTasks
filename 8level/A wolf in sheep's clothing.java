package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(ZywOo.warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep", "wolf"}));
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class ZywOo {

  public static String warnTheSheep(String[] array) {
    for(int i=0;i<array.length;i++){
        if(array[i]=="wolf"){
            if(i==array.length-1){
              return "Pls go away and stop eating my sheep";  
            }
            else{
              return "Oi! Sheep number " + (array.length-i-1) +"! You are about to be eaten by a wolf!";   
            }
           
        }
    }
    return null;
  }

}
