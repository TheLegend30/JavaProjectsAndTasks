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
class LineNumbering {
    public static List<String> number(List<String> lines) {
        ArrayList<String> result = new ArrayList<String>();
        for(int i=1;i<lines.size();i++){
            result.add(i+": "+lines.get(i-1));
        }
        return result;
    }
}
