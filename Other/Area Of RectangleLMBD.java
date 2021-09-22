package katatemplateproject;

import java.util.*;

public class KataTemplateProject {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double bot = in.nextDouble();
        double s = in.nextDouble();
        AreaRectangle aR = (bottom,side) -> Math.round(bottom * side);
        System.out.println(aR.AR(bot, s));
    }
}

interface AreaRectangle {

    double AR(double bottom,double side);
}
