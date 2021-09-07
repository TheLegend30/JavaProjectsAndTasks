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
class Welcome {
   public static String greet(String language){
       switch (language){
           case "czech":
               return "Vitejte";    
           case "danish":
               return "Velkomst";    
           case "dutch":
               return "Welkom";    
           case "estonian":
               return "Tere tulemast";    
           case "finnish":
               return "Tervetuloa";    
           case "flemish":
               return "Welgekomen";    
           case "french":
               return "Bienvenue"; 
           case "german":
               return "Willkommen";    
           case "irish":
               return "Failte";    
           case "italian":
               return "Benvenuto";    
           case "latvian":
               return "Gaidits";    
           case "lithuanian":
               return "Laukiamas"; 
           case "polish":
               return "Witamy";    
           case "spanish":
               return "Bienvenido";    
           case "swedish":
               return "Valkommen";    
           case "welsh":
               return "Croeso";    
           default:
               return "Welcome";
       }
   }
}
