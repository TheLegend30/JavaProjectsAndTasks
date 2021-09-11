package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Kata.findUniq(new double[]{0, 1, 0}));
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Kata {
    public static double findUniq(double arr[]) {
      ArrayList<Double> s = new ArrayList<Double>();
      for(double d:arr){
          s.add(d);
      }
      Collections.sort(s);
      double d = s.get(0);
      s.remove(0);
      if(d==s.get(0)){
          return s.get(s.size()-1);
      }
      else{
          return d;
      }

    }
}
