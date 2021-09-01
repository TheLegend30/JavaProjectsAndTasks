package katatemplateproject;
 
import java.util.Arrays;

public class KataTemplateProject {
    public static void main(String[] args) {
       prnt(SequenceSum.showSequence(15));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}

class SequenceSum{
  public static String showSequence(int value){
    String result ="";
    int sum=value;
    if(value==0){
        return result="0=0";
    }
    else if(value<0){
        return result=value+"<0";
    }
    else{
        for(int i=0;i<value;i++){
            result=result.concat(Integer.toString(i)).concat("+");
            sum+=i;
        }
        result=result.concat(Integer.toString(value)).concat(" = ").concat(Integer.toString(sum));
        return result;
    }
  }
}
