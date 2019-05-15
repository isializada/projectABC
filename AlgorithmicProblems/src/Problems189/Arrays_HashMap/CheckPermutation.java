package Problems189.Arrays_HashMap;

import java.util.HashSet;
import java.util.Set;

public class CheckPermutation {
  public static void main(String[] args){
    System.out.println(checkPermutation("abc", "cda"));
  }

  private static boolean checkPermutation(String first, String second) {
    Set<Character> characterSet = new HashSet<>();
    char[] firstAsChar = first.toCharArray();
    char[] secondAsChar = second.toCharArray();

    for(char element : firstAsChar){
      characterSet.add(element);
    }

    for(char element : secondAsChar){
      if(!characterSet.contains(element))
        return false;
    }

    return true;

  }
}
