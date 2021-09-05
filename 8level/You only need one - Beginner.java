package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Solution.check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Solution {

    public static boolean check(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }

}
