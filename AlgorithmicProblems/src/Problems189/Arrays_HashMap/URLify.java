package Problems189.Arrays_HashMap;

public class URLify {
  public static void main(String[] args){
    System.out.println(updateStringToUrlString(" Test stret  dasd  ", 13));
  }

  private static String updateStringToUrlString(String text, int textLen) {
    char[] textArray = text.trim().toCharArray();
    String result = "";
    boolean wasEmpty = false;

    for(char element : textArray){
      if(element == ' ' && wasEmpty)
        continue;

      if(element == ' '){
        result += "%20";
        wasEmpty = true;
      }else{
        result += element;
        wasEmpty = false;
      }
    }

    return result;
  }
}

