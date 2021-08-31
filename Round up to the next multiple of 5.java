package katatemplateproject;
 
public class KataTemplateProject {
    public static void main(String[] args) {
        System.out.println(RoundToTheNextMultipleOf5.roundToNext5(-5));
    }
}
class RoundToTheNextMultipleOf5 {

  public static int roundToNext5(int number) {
    while(number%5!=0){
        number++;
    }
    return number;
  }
}
