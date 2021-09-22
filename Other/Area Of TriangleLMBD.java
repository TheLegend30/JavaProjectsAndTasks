package katatemplateproject;

import java.util.*;

public class KataTemplateProject {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double bot = in.nextDouble();
        double h8 = in.nextDouble();
        AreaTriangle at = (bottom,height) -> Math.round(0.5  * bottom * height);
        System.out.println(at.AT(bot, h8));
    }
}

interface AreaTriangle {

    double AT(double bottom,double height);
}
