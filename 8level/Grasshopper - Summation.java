package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class GrassHopper {

    public static int summation(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}
