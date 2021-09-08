package katatemplateproject;
import java.util.*;
import java.util.regex.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(SquareDigit.squareDigits(9119)) ; 
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class SquareDigit {

  public static int squareDigits(int n) {
    String presult = "";
    int result = 0;
    for(int i=0;i<Integer.toString(n).length();i++){
        presult+=(int)(Math.pow(Character.getNumericValue(Integer.toString(n).charAt(i)), 2));
    }
    return (Integer.parseInt(presult));
  }

}
