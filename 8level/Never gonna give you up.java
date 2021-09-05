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
class Kata {
  public static List<String> music(List<Integer> numbers){
      String f ="";
      ArrayList<String> result = new ArrayList<String>();
      for(int i=0;i<numbers.size();i++){
          if((i+1)%2==0){
              f ="NEVER GONNA ";
          }
          else{
              f = "Never gonna ";
          }
          switch (numbers.get(i)){
              case 0:
                  result.add(f+"give you up");
                  break;
              case 1:
                  result.add(f+"let you down");
                  break;
              case 2:
                  result.add(f+"run around and desert you");
                  break;
              case 3:
                  result.add(f+"make you cry");
                  break;
              case 4:
                  result.add(f+"say goodbye");
                  break;
              case 5:
                  result.add(f+"tell a lie and hurt you");
                  break;    
                  
          }
      }
      return result;    
  } 
}
