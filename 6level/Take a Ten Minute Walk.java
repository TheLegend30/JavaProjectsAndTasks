class TenMinWalk {
  public static boolean isValid(char[] walk) {
    if(walk.length>10 || walk.length<3){
        return false;
    }
    int x = 0,y=0;
    for(int i=0;i<walk.length;i++){
        switch(walk[i]){
            case 'n':
                y++;
                break;
            case 's':
                y--;
                break;
            case 'w':
                x++;
                break;
            case 'e':
                x--;
                break;
                
        }
    }
    if(x==0 & y==0){
        return true;
    }
    return false;
  }
}
