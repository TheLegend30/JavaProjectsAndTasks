package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(GCD.compute(30,12));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class GCD {
    public static int compute(int x, int y) {
        int gdc=0;
        if(x>=y){
            gdc=y;
        }
        else{
            gdc=x;
        }
        while(x%gdc!=0 | y%gdc!=0){
            gdc--;
        }
        return gdc;
        
    }
}
