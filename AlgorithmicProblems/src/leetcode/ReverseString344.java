package leetcode;

public class ReverseString344 {

  public static void main(String[] args){
    reverseString("ismayl".toCharArray());
  }

  public static void reverseString(char[] s) {
    Character helper;

    for(int i=0; i< s.length/2; i++){
      helper = s[i];
      s[i] = s[s.length - i - 1];
      s[s.length - i - 1] = helper;
    }

    System.out.println(s);
  }
}
