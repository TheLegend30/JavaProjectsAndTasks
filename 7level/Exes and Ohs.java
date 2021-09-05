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
class XO {
  
  public static boolean getXO (String str) {
      int countx=0,counto=0;
      char[] ch = str.toCharArray();
      for(int i=0;i<ch.length;i++){
          if(ch[i]=='x'||ch[i]=='X'){
              countx++;
          }
          else if(ch[i]=='o'||ch[i]=='O'){
              counto++;
          }
      }
    
      return (countx==counto);
    
  }
}
