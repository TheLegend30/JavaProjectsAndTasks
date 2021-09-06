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
class Kata {
    public static final String generateShape(int n) {
        String result="";
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                result+="+";
            }
            if(i!=n-1){
                result+="\n";
            }
            
        }
        return result;
    }
}
