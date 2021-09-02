package katatemplateproject;
 
import java.util.Arrays;

public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Solution.dashatize(Integer.MIN_VALUE));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Solution {

    public static String dashatize(int num) {
        if(num<1)num*=-1;
        String s="";
        char[] ch=Integer.toString(num).replace("-","").toCharArray();
        for(int i=0;i<ch.length;i++){
            if(Character.getNumericValue(ch[i])%2==0){
                s+=ch[i];
            }
            else{
                if(ch.length==1){
                    s+=ch[i];
                }
                else if(i==0){
                    s+=ch[i]+"-";
                }
                else if(i==ch.length-1){
                    s+="-"+ch[i];
                }
                else{
                   s+="-"+ch[i]+"-"; 
                }
                
            }
        }
        
        s = s.replace("--","-");
        return s;
    }

}
