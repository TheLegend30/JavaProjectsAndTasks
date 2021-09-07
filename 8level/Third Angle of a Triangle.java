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
class ThirdAngle {
    public static int otherAngle(int angle1, int angle2) {
        return (180-angle1-angle2);
    }
}
