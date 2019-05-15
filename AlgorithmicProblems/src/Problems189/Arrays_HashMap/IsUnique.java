package Problems189.Arrays_HashMap;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {
  public static void main(String[] args){
    System.out.println(areStringElementsUnique("asdfa"));
  }

  private static boolean areStringElementsUnique(String value) {
    Set<Character> characters = new HashSet<>();
    char[] valueAsElements = value.toCharArray();
    for (char element:valueAsElements) {
      if(characters.contains(element))
        return false;

      characters.add(element);
    }
    return true;
  }
}
