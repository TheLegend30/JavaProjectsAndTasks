package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Solution.toCamelCase("the-stealth-warrior"));
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Kata {
  
  public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
     return(distanceToPump<=mpg*fuelLeft);
  }
  
}
