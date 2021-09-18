package katatemplateproject;

import java.util.*;
public class KataTemplateProject
 {

    public static void main(String[] args) {
        System.out.println(Solution.isAscOrder(new int[]{1,2,4,7,19}));
    }
}
class Solution {

  public static boolean isAscOrder(int[] arr) {
    List<Integer> origlist = new ArrayList<Integer>();
    List<Integer> list = new ArrayList<Integer>();
    for(int i:arr){
        list.add(i);
        origlist.add(i);
    }
    Collections.sort(list);
    return (list.toString().equals(origlist.toString()));
  }

}
