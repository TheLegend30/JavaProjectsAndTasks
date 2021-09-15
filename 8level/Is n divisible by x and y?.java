package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
    
}
class DivisibleNb {
	public static boolean isDivisible(long n, long x, long y) {
		return (n%x==0 & n%y==0);
	}
}
