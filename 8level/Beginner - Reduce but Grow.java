package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Kata{

  public static int grow(int[] x){
    int result=1;
    for(int i:x){
        result*=i;
    }
    return result;
  
  }

}
