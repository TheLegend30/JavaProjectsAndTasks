package katatemplateproject;
import java.util.*;
import java.util.regex.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Kata.countPositivesSumNegatives(null));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
        if(input==null || input.length==0){
            return new int[]{};
        }
        int count=0;
        int sumneg=0;
        for(int i=0;i<input.length;i++){
            if(input[i]>0){
                count++;
            }
            else{
                sumneg+=input[i];
            }
        }
        return new int[] {count,sumneg}; 
    }
}
