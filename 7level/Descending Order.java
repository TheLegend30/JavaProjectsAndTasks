package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
       prnt(DescendingOrder.sortDesc(1121234));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class DescendingOrder {
  public static int sortDesc(final int num) {
     ArrayList<String> l = new ArrayList<String>();
     String[] news = String.valueOf(num).split("");
     for(String s:news){
         l.add(s);
     }
     Collections.sort(l);
     Collections.reverse(l);
     return Integer.parseInt(l.toString().replace("[", "").replace("]","").replace(",", "").replace(" ",""));
  }
}
