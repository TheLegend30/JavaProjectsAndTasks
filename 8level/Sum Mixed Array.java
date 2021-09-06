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

class MixedSum {

	public int sum(List<?> mixed) {	
                int sum = 0;
                for(int i=0;i<mixed.size();i++){                   
                    sum+=Integer.parseInt(mixed.get(i).toString());
                }
		return sum;
	}
}
