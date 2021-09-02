package katatemplateproject;
 
import java.util.Arrays;

public class KataTemplateProject {
    public static void main(String[] args) {
       prnt(BumpsTheRoad.bumps("___nnnnnnnnnnnnnn"));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class BumpsTheRoad {
  public static String bumps(final String road) {
    int bumpscount=0;
    char[] chmas = road.toCharArray();
    for(int i=0;i<road.length();i++){
        if(chmas[i]=='n'){
            bumpscount++;
        }
        if(bumpscount>15){
            return "Car Dead";
        }
    }
    return "Woohoo!";
  }
}
