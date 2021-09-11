package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Kata.reverseWords("   "));
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Kata
{
  public static String reverseWords(final String original)
  {
     if(original.isBlank()){
         return original;
     }
     ArrayList<Character> list = new ArrayList<Character>();
     String[] s = original.split(" ");
     char[][] chars = new char[s.length][];
     for(int i=0;i<s.length;i++){
         chars[i]=s[i].toCharArray();
     }
     String result = "";
     for(int i=0;i<chars.length;i++){
         for(int j=0;j<chars[i].length;j++){
             list.add(chars[i][j]);
         }
         Collections.reverse(list);
         result+=list.toString().replace(",", "").replace(" ","").replace("[","").replace("]", "");
         if(i!=chars.length-1){
             result+=" ";
         }
         list.clear();
     }
     return result;
  }
}
