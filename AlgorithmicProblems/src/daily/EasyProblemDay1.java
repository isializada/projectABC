package daily;

/*
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?*/

import java.util.HashSet;

public class EasyProblemDay1 {

  public static void main(String[] args){

  }

  private static Boolean findAddUpToNumber(int[] numbers, int k){
    HashSet<Integer> numbersSet = new HashSet<>();
    try {
      for(int number : numbers){
          numbersSet.add(k - number);
      }
    }catch (Exception ex){
      return true;
    }
    return false;
  }

}
