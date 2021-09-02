package katatemplateproject;
 
import java.util.Arrays;

public class KataTemplateProject {
    public static void main(String[] args) {
      prnt(Kata.encryptThis(""));   
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Kata {
    public static String encryptThis(String text) {
        String[] spltext = text.split(" ");
        char[][] ch = new char[spltext.length][];
        for(int i=0;i<spltext.length;i++){
            ch[i]=spltext[i].toCharArray();
        }
        String s="";
        int a=0;
        for(int i=0;i<spltext.length;i++){
            for(int j=0;j<ch[i].length;j++){
                if(j==0){
                    a=ch[i][j];
                    s+=a;
                }
                else if(j==1){
                    char buffer=ch[i][j];
                    ch[i][j]=ch[i][ch[i].length-1];
                    ch[i][ch[i].length-1]=buffer;
                    s+=ch[i][j];
                }
                else{
                    s+=ch[i][j];
                }
            }
            if(i!=spltext.length-1){
             s+=" ";  
            }
        }
        return s;
    }
}
