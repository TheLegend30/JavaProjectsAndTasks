package katatemplateproject;
public class KataTemplateProject {
    public static void main(String[] args) {

    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
    
}
class RepeatIt {

  public static String repeatString(final Object toRepeat, final int n) {
      if(toRepeat.getClass().getTypeName()!="java.lang.String"){
          return "Not a string";
      }
      String result="";
      for(int i=0;i<n;i++){
          result+=toRepeat.toString();
      }
      return result;
  }
  
}
