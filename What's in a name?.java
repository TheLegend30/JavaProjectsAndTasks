package katatemplateproject;

public class KataTemplateProject {
    public static void main(String[] args) {
        prnt(Kata.nameInStr("Next to a lake", "chris"));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Kata{
    public static boolean nameInStr(String str, String name){
        char[] namech = name.toCharArray();
        char[] strch = str.toCharArray();
        int counter = 0;
        for(int i=0;i<str.length();i++){
            if(namech[counter]==strch[i]){
                counter++;
            }
        }
        return counter == name.length();
    }
}
