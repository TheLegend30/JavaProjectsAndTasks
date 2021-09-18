package katatemplateproject;

import java.util.*;
public class KataTemplateProject
{
    public static void main(String[] args) {
    }
}

class Kata
{
  public static boolean smallEnough(int[] a, int limit)
  {
    for(int i:a){
        if(i>limit){
            return false;
        }
    }
    return true;
  }
}
