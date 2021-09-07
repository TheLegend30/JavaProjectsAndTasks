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
class TotalPoints {
  
    public static int points(String[] games) {
       int x = 0, y = 0 , points = 0;
       for(int i=0;i<games.length;i++){
           x=Character.getNumericValue(games[i].charAt(0));
           y=Character.getNumericValue(games[i].charAt(2));
           if(x>y){
               points+=3;
           }
           else if(x==y){
               points++;
           }
       }
       return points;
    }
}
