package katatemplateproject;

import java.util.*;

public class KataTemplateProject {

    public static void main(String[] args) {
        System.out.println(Factorial(new Scanner(System.in).nextInt()));
    }
    public static int Factorial(int s){
        if(s<=1){
            return 1;
        }
        else{
            return s--*Factorial(s);
        }
    }  
}
