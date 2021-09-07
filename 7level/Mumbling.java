class Accumul {
    
    public static String accum(String s) {
      String result = "";
      int mod=0;
      for(int i=0;i<s.length();i++){
          mod=i+1;
          while(mod>0){
              if(mod==i+1){
                  result+=Character.toUpperCase(s.charAt(i));
              }
              else{
                  result+=Character.toLowerCase(s.charAt(i));
              }
              mod--;
          }
          if(i!=s.length()-1){
              result+="-";
          }
          
      }
      return result;
    }
}
