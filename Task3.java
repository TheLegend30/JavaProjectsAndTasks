package katatemplateproject;
public class KataTemplateProject {
    public static void main(String[] args) {
      for(var i:Kata.digitize(3456)){
          System.out.println(i);
      }
    }
}
class Kata {
  public static int[] digitize(long n) {
    String s = Long.toString(n);
    StringBuilder strbld = new StringBuilder();
    strbld.append(s);
    strbld.reverse();
    s = strbld.toString();
    String[] sarray = s.split("");
    int[] intarray = new int[s.length()];
    for(int i=0;i<s.length();i++){
        intarray[i] = Integer.parseInt(sarray[i]);
    }
    return intarray;
  }
}
