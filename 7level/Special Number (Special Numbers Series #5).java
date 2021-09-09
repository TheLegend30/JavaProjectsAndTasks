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
class Solution
{
    public static String specialNumber(int number)
    {
        String buffer = String.valueOf(number);
        for(int i=0;i<buffer.length();i++){
            if(buffer.charAt(i)=='6' || buffer.charAt(i)=='7' ||buffer.charAt(i)=='8' ||buffer.charAt(i)=='9')
            {
                return "NOT!!";
            }
        }
        return "Special!!";    
    }
}
