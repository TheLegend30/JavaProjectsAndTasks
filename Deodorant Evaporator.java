package katatemplateproject;
 
public class KataTemplateProject {
    public static void main(String[] args) {
        System.out.println(Evaporator.evaporator(10, 10, 10));
    }
}
class Evaporator { 
	
	public static int evaporator(double content, double evap_per_day, double threshold) {
            int day=0;
            double origcontent=content;
            while(content>origcontent*(threshold/100.0)){
                content=content-(content*(evap_per_day/100));
                day++;
            }
            return day;
            
	}
}
