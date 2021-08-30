package katatemplateproject;
import java.util.*;
 
public class KataTemplateProject {
    public static void main(String[] args) {   
        int[] newint = {1,1,1,1,2};
        System.out.println(Solution.stray(newint));
    }
}
class Solution {
  static int stray(int[] numbers) {
    for(int i=0;i<numbers.length;i++){
        if(numbers[i]!=numbers[i+1]){
            try{
                if(numbers[i+1]!=numbers[i+2]){
                return numbers[i+1];
            }
            else{
                return numbers[i];
            }
            }
            catch(ArrayIndexOutOfBoundsException ex){
                return numbers[i+1];
            }           
        }
    }
    return 0;
  }
}
