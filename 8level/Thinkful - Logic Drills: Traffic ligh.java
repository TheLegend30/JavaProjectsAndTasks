package katatemplateproject;

import java.util.*;
public class KataTemplateProject
{
    public static void main(String[] args) {
    }
}

class TrafficLights {

  public static String updateLight(String current) {
    switch (current){
        case "yellow":
            return "red";
        case "green":
            return "yellow";
        default:            
            return "green";
    }
  }
  
}
