package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(JadenCase.toJadenCase(null));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class School{

 	public static int getAverage(int[] marks){
            int result = 0;
            for(int i:marks){
                result+=i;
            }
            return result/marks.length;
	}

}
