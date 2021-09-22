package katatemplateproject;

import java.util.*;

public class KataTemplateProject {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AreaParallelogram aP = (bottom,height)-> (bottom * height);
        System.out.println(aP.AR(in.nextDouble(), in.nextDouble()));
    }
}

interface AreaParallelogram  {

    double AR(double bottom,double height);
}
