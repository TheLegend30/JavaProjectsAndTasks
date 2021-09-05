package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        int[] b =  Kata.between(3, 9);
        for(int i:b){
            prnt(i);
        }
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Kata {

  public static int[] between(int a, int b) {
    int[] beet = new int[(b-a)+1];
    for(int i=0;i<beet.length;i++){
        beet[i] = a++;
    }
    return beet;
  }
}
