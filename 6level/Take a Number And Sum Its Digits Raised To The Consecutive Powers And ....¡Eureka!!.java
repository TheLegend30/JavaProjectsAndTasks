package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
        for(Long item:SumDigPower.sumDigPow(1, 100)){
            prnt(item);
        }
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class SumDigPower {
    
    public static List<Long> sumDigPow(long a, long b) {
        String str;
        long sum=0;
        ArrayList<Long> list= new ArrayList<Long>();
        for(int i=(int)a;i<=b;i++){
            str=Integer.toString(i);
            for(int j=0;j<str.length();j++){
               sum+=Math.pow(Character.getNumericValue(str.charAt(j)), j+1);
            }
            if(sum==i){
                list.add(sum);
            }
            sum=0;
            str="";
            
        }
        return list;
    }
}
