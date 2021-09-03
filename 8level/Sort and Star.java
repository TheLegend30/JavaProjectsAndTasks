package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class SortAndStar {

  public static String twoSort(String[] s) {
    TreeSet<String> treeset = new TreeSet<String>();
    for(String st:s){
        treeset.add(st);
    }
    char[] ch = treeset.first().toCharArray();
    String str ="";
    for(int i=0;i<ch.length;i++){
        if(i==ch.length-1){
            str+=ch[i];
            return str;
        }
        str+=ch[i]+"***";
    }
    return null;
  }
}
