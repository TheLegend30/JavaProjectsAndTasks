package katatemplateproject;
public class KataTemplateProject {
    public static void main(String[] args) {
       System.out.println(Solution.century(2001));
    }
    
}
class Solution {
  public static int century(int number) {
    return number % 100 == 0 ? number/100 : (number/100)+1;
  }
}
