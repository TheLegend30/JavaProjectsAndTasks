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

class OppositesAttract {

  public static boolean isLove(final int flower1, final int flower2) {
      if((flower1%2==0 & flower2%2!=0) |(flower1%2!=0 & flower2%2==0)){
          return true;
      }
      else{
          return false;
      }
  }
  
}
