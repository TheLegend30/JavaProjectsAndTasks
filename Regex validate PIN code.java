package katatemplateproject;
import java.util.*;
 
public class KataTemplateProject {
    public static void main(String[] args) {    
        System.out.println(Solution.validatePin("123456"));
    }
}
class Solution {

  public static boolean validatePin(String pin) {
    char[] p=pin.toCharArray();
    if(p.length==4 || p.length==6){
        for(int i=0;i<p.length;i++){
            if(p[i]>57  || p[i]<48){
                return false;
            }
        }
        return true;
    }
    return false;
  }

}
