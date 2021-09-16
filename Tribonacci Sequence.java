package katatemplateproject;
public class KataTemplateProject {
    public static void main(String[] args) {
        for(double i:Xbonacci.tribonacci(new double[]{1,1,1}, 10)){
            prnt(i);
        }
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
    
}
class Xbonacci {

  public static double[] tribonacci(double[] s, int n) {
      double[] result = new double[n];
      for(int i=0;i<n;i++){
          if(i>2){
              result[i]=result[i-1]+result[i-2]+result[i-3];
          }
          else{
              result[i]+=s[i];
          }
      }
      return result;
  }
}
