package katatemplateproject;
import java.util.*;
 
public class KataTemplateProject {
    public static void main(String[] args) {    
        System.out.println(AbbreviateTwoWords.abbrevName("Petro Poroshenko"));
    }
}

class AbbreviateTwoWords {

  public static String abbrevName(String name) {
      String[] name1 = name.split(" ");
      return (name1[0].charAt(0) +"."+name1[1].charAt(0)).toUpperCase();
  }
}
