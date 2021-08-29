package katatemplateproject;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
 
public class KataTemplateProject {
    public static void main(String[] args) {    
        ArrayList<Integer> list = new ArrayList<Integer>();
         list.add(0);
         list.add(0);    
         list.add(1);    
         list.add(1);    
        
        System.out.println(BinaryArrayToNumber.ConvertBinaryArrayToInt(list));
    }
}

class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String s="";
        for(int i=0;i<binary.size();i++){
            s+=binary.get(i).toString();
        }
        return Integer.parseInt(s,2);
    }
}
