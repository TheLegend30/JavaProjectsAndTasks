package katatemplateproject;
import java.util.*;
 
public class KataTemplateProject {
    public static void main(String[] args) {
        int[] intnew = {1,2,3};
        System.out.println(MinMax.minMax(intnew));
    }
}
class MinMax {
    public static int[] minMax(int[] arr) {
        int min=arr[0],max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }      
        int[] newarr = {min,max};
        return newarr;
    }
}
