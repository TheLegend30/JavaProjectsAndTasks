package katatemplateproject;
 
import java.util.Arrays;

public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Dinglemouse.countDeafRats("O~O~~O~OO~~O~O~O~O  O~~O~OP~OO~O~O~O~O~~O~OO~O~O~O~  O~O~~OO~O~O~O~O~"));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Dinglemouse {

  public static int countDeafRats(final String town) {
      String newtown = town;
      int mod=1;
      int deaf=0;
      newtown = newtown.replace(" ", "");
      String s = "";
      String lamptown="";
      for(int i=0;i<newtown.length();i++){
          s+=newtown.charAt(i);
          if("O~".equals(s)){
              s="";
              lamptown+="1";
          }
          else if("~O".equals(s)){
              s="";
              lamptown+="2";
          }
          else if("P".equals(s)){
              s="";
              lamptown+="P";
          }
      }
      char[] ch=lamptown.toCharArray();
      for(int i=0;i<lamptown.length();i++){
          if(ch[i]=='P'){
            mod=2;  
          }
          else if(ch[i]=='1' && mod==1){
              deaf++;
          }
          else if(ch[i]=='2' && mod==2){
              deaf++;
          }
      }
    return deaf;
  }

}
