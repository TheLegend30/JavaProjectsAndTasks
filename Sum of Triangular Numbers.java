package katatemplateproject;
 
import java.util.Arrays;

public class KataTemplateProject {
    public static void main(String[] args) {
       prnt(Kata.sumTriangularNumbers(3));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Kata
{
  public static int sumTriangularNumbers(int n)
  {
    int sum=1;
    int s=3;
    int mod=0;
    if(n<=0){
        return 0;
    }
    for(int i=0;i<n-1;i++){
        sum+=s;
        s+=3+mod++;
    }
    return sum;
  }
}
