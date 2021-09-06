package katatemplateproject;
import java.util.*;
import java.util.regex.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Kata.solution("actual", ""));
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class FirstNonConsecutive {
    static Integer find(final int[] array) {
        for(int i=array[0]+1,j=1;j<array.length;i++,j++){
            if(i!=array[j]){
                return array[j];
            }
        }
        return null;
    }
}
