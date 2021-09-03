package katatemplateproject;

public class KataTemplateProject {
    public static void main(String[] args) {
        int[] arg={34, -345, -1, 100};
        prnt(SmallestIntegerFinder.findSmallestInt(arg));
    }
    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
       int min=args[0];
       for(int i=1;i<args.length;i++){
           if(min>args[i])min=args[i];
       }
       return min;
    }
}
