package Problems189.Arrays_HashMap;

public class URLify {
  public static void main(String[] args){
    System.out.println(updateStringToUrlString("Test stret dasd  ", 13));
  }

  private static String updateStringToUrlString(String text, int textLen) {
    char[] textArray = text.toCharArray();
    int spaceLen = 0;
    for(char element : textArray){
      if(element == ' '){
        spaceLen++;
      }
    }

    return "";
  }
}

