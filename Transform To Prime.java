package katatemplateproject;
 
import java.util.Arrays;

public class KataTemplateProject {
    public static void main(String[] args) {
        int[] newint = {4};
        prnt(Solution.minimumNumber(newint));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Solution
{
    public static int minimumNumber(int[] numbers)
    {
        int sum=0;
        for(int i:numbers){
            sum+=i;
        }
        int oldsum = sum;
        while(!(isPrime(sum))){
            sum++;
        }
        return sum-oldsum; 
    }
    public static boolean isPrime(int n)
   {
    // Corner case
    if (n <= 1)
        return false;
 
    // Check from 2 to square root of n
    for (int i = 2; i <= Math.sqrt(n); i++)
        if (n % i == 0)
            return false;
 
    return true;
   }
}
