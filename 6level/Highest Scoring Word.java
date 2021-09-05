package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
       prnt(Kata.high("aaa bb"));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Kata {

  public static String high(String s) {
    String[] splitted_s = s.split(" ");
    int[] sums = new int[splitted_s.length];
    int index=0;
    char[][] chars = new char[splitted_s.length][];
    for(int i=0;i<splitted_s.length;i++){
        chars[i]=splitted_s[i].toCharArray();
        for(int j=0;j<chars[i].length;j++){
            sums[i]+=(chars[i][j]-96);
        }
    }
    int buffer = sums[0]; 
    for(int i=1;i<sums.length;i++){
        if(buffer<sums[i]){
            buffer=sums[i];
            index=i;
        }
    }
    return splitted_s[index];
  }

}
