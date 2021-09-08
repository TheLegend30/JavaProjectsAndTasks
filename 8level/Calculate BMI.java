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
class Calculate {
  public static String bmi(double weight, double height) {
      if((weight/Math.pow(height, 2))<=18.5){
          return "Underweight";
      }
      else if((weight/Math.pow(height, 2))<=25.0){
          return "Normal";
      }
      else if((weight/Math.pow(height, 2))<=30.0){
          return "Overweight";
      }
      else{
          return "Obese";
      }
  }
}
