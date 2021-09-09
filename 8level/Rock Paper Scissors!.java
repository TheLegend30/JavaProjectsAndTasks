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
class Kata {
  public static String rps(String p1, String p2) {
      if(p1==p2){
          return "Draw!";
      }
      else if((p1=="scissors" & p2=="paper") || (p1=="paper" & p2=="rock") || (p1=="rock" & p2=="scissors")){
          return "Player 1 won!";
      }
      else{
          return "Player 2 won!";
      }
  }
}
