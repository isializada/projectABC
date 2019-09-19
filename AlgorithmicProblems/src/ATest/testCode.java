package ATest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class testCode {
  public static void main(String[] args){
    DateFormat dateFormat = new SimpleDateFormat("yyMMddHH");
    System.out.println(dateFormat.format(new Date()));

    String a = testThrowEx();
    System.out.println(a);
  }

  private static String testThrowEx() {
    while(true){
      try {
        return getMyString();
      }catch (Exception ex){
        System.out.println("still here");
      }
    }
  }

  private static String getMyString() {
    return "test";
    //throw new NullPointerException("");
  }

}
