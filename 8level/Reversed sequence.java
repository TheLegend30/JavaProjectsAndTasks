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
class Sequence{

  public static int[] reverse(int n){
    int[] s = new int[n];
    for(int i=0;i<n;i++){
        s[i]=n-i;
    }
    return s;
  }

}
