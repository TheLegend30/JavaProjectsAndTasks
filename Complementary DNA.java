package katatemplateproject;
import java.util.*;
 
public class KataTemplateProject {
    public static void main(String[] args) {
        System.out.println(DnaStrand.makeComplement("ATC"));
    }
}
class DnaStrand {
  public static String makeComplement(String dna) {
    String[] dnaarr = dna.split("");
    for(int i = 0;i<dnaarr.length;i++){
        if("A".equals(dnaarr[i])){
            dnaarr[i]="T";
        }
        else if("T".equals(dnaarr[i])){
            dnaarr[i]="A";
        }
        if("C".equals(dnaarr[i])){
            dnaarr[i]="G";
        }
        else if("G".equals(dnaarr[i])){
            dnaarr[i]="C";
        }
    }
    String newdna = Arrays.toString(dnaarr);
    newdna = newdna.replace("[", "");
    newdna = newdna.replace("]", "");
    newdna = newdna.replace(",", "");
    newdna = newdna.replace(" ", "");
    return newdna;
  }
}
