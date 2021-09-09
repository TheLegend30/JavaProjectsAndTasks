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
class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) {
        if((s1+s2+s3)/3>=90){
            return 'A';
        }
        else if((s1+s2+s3)/3<90 & (s1+s2+s3)/3>=80){
            return 'B'; 
        }
        else if((s1+s2+s3)/3<80 & (s1+s2+s3)/3>=70){
            return 'C'; 
        }
        else if((s1+s2+s3)/3<70 & (s1+s2+s3)/3>=60){
            return 'D';  
        }
        else{
            return 'F';
        }
        
    }
}
