package katatemplateproject;
import java.util.*;
import java.util.regex.*;
import java.lang.StringBuilder;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Dubstep.SongDecoder("WUBWUBABCWUB"));
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Dubstep {
  public static String SongDecoder (String song)
  {
     String[] s = song.split("WUB");
     ArrayList<String> list = new ArrayList<String>();
     for(String item:s){
         if(!"".equals(item))list.add(item);      
     }
      
     return list.toString().replace(",", "").replace("[", "").replace("]", "");
   }
}
