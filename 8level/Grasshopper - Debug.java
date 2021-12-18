package com.company;

public class Main{
    public static void main(String[] args){
        System.out.println(GrassHopper.weatherInfo(50));
    }
}
class GrassHopper {

    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c > 0)
            return (c + " is above freezing temperature");
        else
            return (c + " is freezing temperature");
    }

    public static double convertToCelsius(double temperature) {
        double celsius = (temperature - 32.0) * (5.0/9.0);
        return celsius;
    }
}
