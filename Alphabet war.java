package katatemplateproject;
 
import java.util.Arrays;

public class KataTemplateProject {
    public static void main(String[] args) {
       prnt(Kata.alphabetWar("wwwszzzzmmm"));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}

class Kata{
    public static String alphabetWar(String fight){
        int rightSide = 0;
        int leftSide = 0;
        char[] warriors=fight.toCharArray();
        for(int i=0;i<fight.length();i++){
            switch (warriors[i]){
                case 'w':
                    rightSide+=4;
                    break;
                case 'p':
                    rightSide+=3;
                    break;
                case 'b':
                    rightSide+=2;
                    break;
                case 's':
                    rightSide+=1;
                    break;    
                case 'm':
                    leftSide+=4;
                    break;
                case 'q':
                    leftSide+=3;
                    break;
                case 'd':
                    leftSide+=2;
                    break;
                case 'z':
                    leftSide+=1;
                    break;    
            }
        }
        if(leftSide>rightSide){
            return "Right side wins!";
        }
        else if(leftSide<rightSide){
            return "Left side wins!";
        }
        else{
            return "Let's fight again!";
        }
    }
}
