package katatemplateproject;

import java.util.*;
public class KataTemplateProject
 {

    public static void main(String[] args) {
        System.out.println(Kata.dutyFree(12, 50, 1000));
    }
}
class Kata {

  public static int dutyFree(float normPrice, float discount, float hol) {
    
    return (int)(hol/(normPrice*(discount/100)));
    
  }

}
