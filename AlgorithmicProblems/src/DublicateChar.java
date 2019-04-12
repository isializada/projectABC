import java.util.HashSet;

public class DublicateChar {
    public static void main(String []args){
        System.out.println("------Ismail's code------");
        System.out.println();

        System.out.println(DublicateChar("123456378"));
    }

    public static char DublicateChar(String value){
        HashSet<Character> charSet = new HashSet<Character>();
        char[] arr = value.toCharArray();
        Character result = null;
        for(int i=0;i<arr.length;i++){
            if(charSet.add(arr[i])){
            }else{
                result = arr[i];
                break;
            }
        }
        return result;
    }
}
