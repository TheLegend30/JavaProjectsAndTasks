package katatemplateproject;

import java.util.ArrayList;
import java.util.Arrays;

public class KataTemplateProject {

    public static void main(String[] args) {
        System.out.println(Solution.replace("Hi!"));
    }

}
class Solution {
    public static String replace(final String s) {
        StringBuilder sb = new StringBuilder(); 
        for(char i:s.toCharArray()){
            if(Character.toLowerCase(i)=='a' ||  Character.toLowerCase(i)=='e' || Character.toLowerCase(i)=='o' || Character.toLowerCase(i)=='i' || Character.toLowerCase(i)=='u'){
                sb.append('!');
                continue;
            }
            sb.append(i);
        }
        
        return sb.toString(); 
    }
}
