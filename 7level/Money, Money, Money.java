package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
       prnt(Money.calculateYears(1000, 0.05, 0.18, 1100));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Money {
  public static int calculateYears(double principal, double interest,  double tax, double desired) {
      int year = 0;
      while(principal<desired){
          principal += (principal*interest)*(1-tax);
          year++;
      }
      return year;
  }
}
