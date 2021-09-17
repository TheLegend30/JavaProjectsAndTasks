package katatemplateproject;

import java.util.*;

public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Kata.tArea("\n.\n. .\n"));
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
    
}
class Kata{
  public static float tArea(String tStr) {
    String[] str = tStr.split("\n");
    float len = str.length-2;
    return((len*len)/2f);
  }
}
