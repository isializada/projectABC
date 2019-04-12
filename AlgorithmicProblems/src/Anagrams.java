import java.util.Arrays;

public class Anagrams {
    public static void main(String []args){
        System.out.println("------Ismail's code------");
        System.out.println();

        System.out.println(CheckAnagrams("das das", "sad sda"));
    }

    public static Boolean CheckAnagrams(String a, String b){
        char[] str1Arr = a.toCharArray();
        char[] str2Arr = b.toCharArray();
        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        if(str1Arr.length == str2Arr.length){
            for(int i = 0; i < str1Arr.length; i++){
                if(str1Arr[i] != str2Arr[i]){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }


    }
}
