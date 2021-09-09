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
class Paper
{
  public static int paperWork(int n, int m) 
  {
    if(n<0 | m<0){
        return 0;
    }
    else{
        return n*m;
    }
  }
}
