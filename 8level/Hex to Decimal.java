package katatemplateproject;

import java.util.*;
public class KataTemplateProject
{
    public static void main(String[] args) {
        System.out.println(Kata.hexToDec("FF"));
    }
}

class Kata {

  public static int hexToDec(final String hexString) {
    return Integer.parseInt(hexString,16);
  }
  
}
