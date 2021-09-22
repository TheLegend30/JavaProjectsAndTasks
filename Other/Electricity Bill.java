package katatemplateproject;

import java.util.*;

public class KataTemplateProject {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(PriceForElectricity(in.nextInt(),in.nextInt(),in.nextInt()));
    }
    public static int PriceForElectricity(int TotalKW, int Hours, int PriceForUnit){
        return (TotalKW*Hours*PriceForUnit*30)/1000;
    }  
}
