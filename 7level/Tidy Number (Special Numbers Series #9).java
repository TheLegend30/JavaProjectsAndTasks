package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Solution.tidyNumber(10));
        
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
    
}
class Solution
{
    public static boolean tidyNumber(int number)
    {
        String[] h = String.valueOf(number).split("");
        int buffer = 0;
        for(int i=0;i<h.length;i++){
            if(Integer.parseInt(h[i])<buffer){
                return false;
            }
            buffer = Integer.parseInt(h[i]);
        }
        return true;
    }
}
