package katatemplateproject;
import java.util.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(JadenCase.toJadenCase(null));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class JadenCase {

	public static String toJadenCase(String phrase) {
		if(phrase==null || phrase.isBlank() || phrase.isBlank()){
                    return null;
                }
		String[] buffer = phrase.split(" ");
                String result = "";
                char[][] ch = new char[buffer.length][];
                for(int i=0;i<buffer.length;i++){
                    ch[i] = buffer[i].toCharArray();
                }
                for(int i=0;i<ch.length;i++){
                    ch[i][0] = Character.toUpperCase(ch[i][0]);
                    for(int j=0;j<ch[i].length;j++){
                        result+=ch[i][j];
                    }
                    if(i!=ch.length-1){
                        result+=" ";
                    }
                }

                return result;
	}

}
