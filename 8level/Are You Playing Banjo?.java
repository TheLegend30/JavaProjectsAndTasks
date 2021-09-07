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
class Banjo {
  public static String areYouPlayingBanjo(String name) {
    if(name.charAt(0)=='R' || name.charAt(0)=='r'){
        return name + " plays banjo";
    }
    return name + " does not play banjo";
  }
}
