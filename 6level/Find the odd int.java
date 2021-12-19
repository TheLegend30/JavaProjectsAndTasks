package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {1,1,1,2,5,2,1};
        System.out.println(FindOdd.findIt(a));
    }
}

class FindOdd {
    public static int findIt(int[] a) {
        Arrays.sort(a);
        int odd = 1;
        int oddNumber = a[0];
        for(int i=0;i<a.length-1;i++){
            if(a[i] == a[i+1]){
                odd++;
            }
            else{
                if(odd%2!=0){
                    oddNumber = a[i];
                    break;
                }
                else if(i+1 == a.length-1){
                    oddNumber = a[i+1];
                    break;
                }
                else{
                    odd=1;
                }
            }
        }
        return oddNumber;
    }
}
