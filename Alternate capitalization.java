package katatemplateproject;
 
import java.util.Arrays;

public class KataTemplateProject {
    public static void main(String[] args) {
       for(String s:Solution.capitalize("ukraina")){
           prnt(s);
       }
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}

class Solution{
    public static String[] capitalize(String s){
        char[] evench = s.toCharArray();
        char[] oddch = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                evench[i]-=32;
            }
            else{
                oddch[i]-=32;
            }
        }
        String evenstr = (Arrays.toString(evench)).replace(",", "").replace("]", "").replace("[","").replace(" ","");
        String oddstr = (Arrays.toString(oddch)).replace(",", "").replace("]", "").replace("[","").replace(" ","");
        String[] result={evenstr,oddstr};
        return result;
    }
}
