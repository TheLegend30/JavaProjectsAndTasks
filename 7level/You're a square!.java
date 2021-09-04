package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        Dinglemouse d = new Dinglemouse("Adolf","Hitler");
        prnt(d.getFullName());        
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Square {    
    public static boolean isSquare(int n) {        
        return (Math.sqrt(n)==Math.round(Math.sqrt(n)));
    }
}
