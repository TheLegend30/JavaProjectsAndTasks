package com.company;
public class Main{
    public static void main(String[] args){
        System.out.println( Kata.remove("!!!Hi !!hi!!! !hi", 3));
    }
}
class Kata {

    public static String remove(String s, int n){
        StringBuilder sb = new StringBuilder(s);
        for(int i=0,j=0;j<n;i++){
            if(i==sb.length()){
                break;
            }
            else if(sb.charAt(i)=='!'){
                sb.deleteCharAt(i);
                i=-1;
                j++;
            }
        }
        return sb.toString();
    }

}
