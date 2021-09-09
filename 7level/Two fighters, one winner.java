package katatemplateproject;
import java.util.*;
import java.util.regex.*;
public class KataTemplateProject {
    public static void main(String[] args) {
        
    }

    public static <T> void prnt(T args){
        System.out.println(args);
    } 
}
class Kata {
  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
     int fattacer=0;
     if(firstAttacker==fighter2.name){
         fattacer++;
     }
     while(fighter1.health>0 & fighter2.health>0){
         if(fattacer%2==0){
             fighter2.health-=fighter1.damagePerAttack;
         }
         else{
             fighter1.health-=fighter2.damagePerAttack;
         }    
         fattacer++;
     }
     if(fighter1.health<=0){
         return fighter2.name;
     }
     else{
         return fighter1.name;
     }
  }
}
class Fighter {
  public String name;
  public int health, damagePerAttack;
  public Fighter(String name, int health, int damagePerAttack) {
    this.name = name;
    this.health = health;
    this.damagePerAttack = damagePerAttack;
  }
}
