package com.company;

public class Main{
    public static void main(String[] args){
        System.out.println(WideMouthedFrog.mouthSize("Alligator"));
    }
}
class WideMouthedFrog{
    public static String mouthSize(String animal){
        var mouth = animal.equalsIgnoreCase("alligator") ? "small" : "wide";
        return mouth;
    }
}
