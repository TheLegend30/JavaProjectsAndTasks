package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
    
}
class CuboidVolumes {
  public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
    int result = (firstCuboid[0]*firstCuboid[firstCuboid.length-2]*firstCuboid[firstCuboid.length-1])-(secondCuboid[0]*secondCuboid[secondCuboid.length-2]*secondCuboid[secondCuboid.length-1]);
    if(result>0){
        return result;
    }  
    return -result;
  }
}
