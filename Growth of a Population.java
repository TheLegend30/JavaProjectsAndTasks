package katatemplateproject;

public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Arge.nbYear(1500, 5, 100, 5000));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Arge {
    
    public static int nbYear(int p0, double percent, int aug, int p) {
        int countYear=0;
        while(p0<p){
            p0+=aug+(p0*(percent/100));
            countYear++;
        }
        return countYear;
    }
}
