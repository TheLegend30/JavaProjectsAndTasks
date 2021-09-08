package katatemplateproject;
import java.util.*;
import java.util.regex.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Diamond.print(-99));
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Diamond {
  public static String print(int n) {
      if(n%2==0 |n<0){
          return null;
      }
      int mod=0;
      int modifier = n; 
      int count_space = 0;
      String[] saver = new String[((n-1)/2)];
      for(int i=0;i<saver.length;i++){
          saver[i]="";
      }
      while(modifier>1){
         modifier-=2;
         count_space++;        
      }
      String result = "";
      for(int i=1,k=0;i<=n;i+=2,k++){
          mod=i;
          for(int j=0;j<count_space;j++){
              result+=" ";
              if(i!=n){
                  saver[k]+=" ";
              }
          }
          while(mod>0){
              result+="*";
              if(i!=n){
                  saver[k]+="*";
              }
              mod--;
          }
          count_space--;
          result+="\n"; 
          if(k<saver.length){
            saver[k]+="\n";  
          }
             
       }
      for(int i=saver.length-1;i>=0;i--){
          result+=saver[i];
      }
      return result;
    }
}
