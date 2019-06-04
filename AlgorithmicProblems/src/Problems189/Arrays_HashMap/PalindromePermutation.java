package Problems189.Arrays_HashMap;

import java.util.Arrays;

public class PalindromePermutation {
  public static void main(String[] args){
    System.out.println(permutatuinPalindrome("nfvvvf f vn"));
  }

  private static boolean permutatuinPalindrome(String request){
    request = request.replace(" ","").toLowerCase();
    char[] requestElementsArray = request.toCharArray();
    Arrays.sort(requestElementsArray);

    int helperCount = 1;
    int oddCount = 0;
    for(int i=1; i<requestElementsArray.length; i++){
      if(requestElementsArray[i] == requestElementsArray[i-1]){
        helperCount++;
      } else if(helperCount%2 != 0){
        oddCount++;
        helperCount = 1;
      } else {
        helperCount = 1;
      }

      if(oddCount > 1){
        return false;
      }
    }

    return helperCount%2 == 0 || oddCount < 1;
  }
}
