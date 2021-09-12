package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
        for(int i:DeadFish.parse("iiisdoso")){
            prnt(i);
        }
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class DeadFish {
    public static int[] parse(String data) {
        int sum=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<data.length();i++){
            switch(data.charAt(i)){
                case 'i':
                    sum++;
                    break;
                case 'd':
                    sum--;
                    break;
                case 's':
                    sum=(int)Math.pow(sum,2);
                    break;
                case 'o':
                    list.add(sum);
                    break;
                default:
                    break;
            }
        }
        int[] result = new int[list.size()];
        for(int i=0;i<result.length;i++){
            result[i]=list.get(i);
        }
        return result;
    }
}
