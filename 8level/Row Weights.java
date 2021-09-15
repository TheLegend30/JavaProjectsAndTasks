package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
        for(int i:Solution.rowWeights(new int[]{100,50})){
            prnt(i);
        }
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
    
}
class Solution
{
    public static int[] rowWeights (final int[] weights)
    {
        int[] result = {0,0};
        for(int i=0;i<weights.length;i++){
            if(i%2==0){
                result[0]+=weights[i];
            }
            else{
                result[1]+=weights[i];
            }
        }
        return result;
    }
}
