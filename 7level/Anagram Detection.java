package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Kata.isAnagram("Buckethead","DeathCubeK"));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Kata {
  public static boolean isAnagram(String test, String original) {
    if(test.length()!=original.length()){
        return false;
    }
    String[] listfirst = test.toLowerCase().split("");
    String[] listsecond = original.toLowerCase().split("");
    TreeSet<String> first= new TreeSet<String>();
    TreeSet<String> second= new TreeSet<String>();
    for(int i=0;i<test.length();i++){
        first.add(listfirst[i]);
        second.add(listsecond[i]);
    } 
    return first.hashCode()==second.hashCode();
  }
}
