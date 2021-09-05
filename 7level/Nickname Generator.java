package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
      prnt(Generator.nickname("Loashara"));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Generator {
      public static String nickname (String name) {
        if(name.length()<4){
            return "Error: Name too short";
        }
        switch (name.charAt(2)){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'u':
            case 'U':
            case 'o':
            case 'O':
            case 'i':
            case 'I':
                return name.substring(0, 4);
            default:  
                return name.substring(0, 3);
        }
      }
}
