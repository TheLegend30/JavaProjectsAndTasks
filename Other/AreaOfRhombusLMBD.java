package katatemplateproject;

import java.util.*;

public class KataTemplateProject {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        AreaParallelogram aP = (dia1,dia2)-> Math.round(dia2 * dia1 * 0.5);
        System.out.println(aP.AR(in.nextDouble(), in.nextDouble()));
    }
}

interface AreaParallelogram  {

    double AR(double dia1,double dia2);
}
