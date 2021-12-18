package com.company;
import java.lang.*;
public class Main{
    public static void main(String[] args){
        final BackspacesInString bis = new BackspacesInString();
        String s = bis.cleanString("##6#+yqw8hfklsd-=-f");
        System.out.println(s);
    }
}
class BackspacesInString {
    public String cleanString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i)=='#'){
                if(i-1<0){
                    sb.deleteCharAt(i);
                }
                else{
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i-1);
                }
                i=-1;
            }
        }
        s = sb.toString();
        return s;
    }
}
