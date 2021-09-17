package katatemplateproject;

import java.util.*;

public class KataTemplateProject {
    public static void main(String[] args) {
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
    
}
class Kata {

  public static String well(String[] x) {
    int counter=0;
    for(String i:x){
        if(i=="good"){
            counter++;
        }
    }
    if(counter>2){
        return "I smell a series!";
    }
    else if(counter>0){
        return "Publish!";
    }
    else{
        return "Fail!";
    }
  }

}
