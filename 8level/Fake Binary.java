package katatemplateproject;
import java.util.*;
import java.util.regex.*;
public class KataTemplateProject {
    public static void main(String[] args) {
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class FakeBinary {
    public static String fakeBin(String numberString) {
        String result = "";
        for(int i=0;i<numberString.length();i++){
            if(Character.getNumericValue(numberString.charAt(i))>=5){
                result+="1";
            }
            else{
                result+="0";
            }
        }
        return result;
    }
}
