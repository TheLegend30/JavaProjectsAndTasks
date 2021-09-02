class Keypad {
  public static int presses(String phrase) {
     int press=0;
     char[] ch = phrase.toUpperCase().toCharArray();
     for(int i=0;i<phrase.length();i++){
         switch (ch[i]){
             case '1':
             case 'A':
             case 'D':
             case 'G':
             case 'J':
             case 'M':
             case 'P':
             case 'T':  
             case 'W':
             case '*':
             case ' ':
             case '#':
                 press+=1;
                 break;
             case 'B':
             case 'E':
             case 'H':
             case 'K':
             case 'N':
             case 'Q':
             case 'U':
             case 'X':
             case '0':
                 press+=2;
                 break;
             case 'C':
             case 'F':
             case 'I':
             case 'L':
             case 'O':
             case 'R':
             case 'V':
             case 'Y':
                 press+=3;
                 break;
             case '2':
             case '3':
             case '4':
             case '5':
             case '6':
             case 'S':
             case '8':
             case 'Z':
                 press+=4;
                 break;
             case '7':
             case '9':  
                 press+=5;
                 break;
         }
     }
     return press;
  }
}
