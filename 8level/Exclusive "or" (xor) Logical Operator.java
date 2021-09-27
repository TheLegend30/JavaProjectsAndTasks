package katatemplateproject;

import java.util.*;

public class KataTemplateProject {
    public static void main(String[] args){
        System.out.println(XOR.xor(false, true));
    }
            
}
class XOR {
    
    public static boolean xor(boolean a, boolean b) {
        return a!=b ? true : false;
    }
}
