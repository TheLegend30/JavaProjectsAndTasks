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
class Dinglemouse {

  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
    int catYears=0,dogYears=0;
    if(humanYears>=1){
        catYears=15;
        dogYears=15;
    }
    if(humanYears>=2){
        catYears+=9;
        dogYears+=9;
    }
    for(int i=3;i<=humanYears;i++){
        catYears+=4;
        dogYears+=5;
    }
    return new int[]{humanYears,catYears,dogYears};
  }

}
