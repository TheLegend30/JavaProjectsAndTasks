package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");;
        prnt(SmileFaces.countSmileys(a));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}

class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
      int smilecounter=0;
      String[] smiles = new String[arr.size()];
      for(int i =0;i<smiles.length;i++){
          smiles[i]=arr.get(i);
      }
      char[][] ch = new char[smiles.length][];
      for(int i=0;i<smiles.length;i++){
          ch[i]=smiles[i].toCharArray();
      }
      for(int i=0;i<smiles.length;i++){
         if(ch[i].length>=2 & ch[i].length<=3){
            if(ch[i][0]==':' | ch[i][0]==';'){
                if(ch[i].length==2){
                    if(ch[i][ch[i].length-1]==')' | ch[i][ch[i].length-1]=='D'){
                        smilecounter++;
                    }
                }
                else if(ch[i][ch[i].length-2]=='-' | ch[i][ch[i].length-2]=='~'){
                     if(ch[i][ch[i].length-1]==')' | ch[i][ch[i].length-1]=='D'){
                        smilecounter++;
                    }
                }
          } 
         }          
      }
      return smilecounter;
  }
}
