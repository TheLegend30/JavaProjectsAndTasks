package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}

class NumberFun {
  public static long findNextSquare(long sq) {
      if(Math.sqrt(sq)==Math.round(Math.sqrt(sq))){
          return (Math.round(Math.sqrt(sq))+1)*(Math.round(Math.sqrt(sq))+1);
      }
      return -1; 
  }
}
