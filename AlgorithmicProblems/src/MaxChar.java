import java.util.HashMap;
import java.util.Map;

public class MaxChar {
    public static void main(String []args){
        System.out.println("------Ismail's code------");
        System.out.println();

        System.out.println(MaxChar("dasdadwdasdacads"));
    }

    public static Character MaxChar(String value){
        Map<Character, Integer> charMap = new HashMap<>();
        char[] arr = value.toCharArray();
        Integer maxCount = 1;
        Character maxChar = null;
        Character result = null;
        for(int i=0;i<arr.length;i++){
            if(charMap.get(arr[i]) == null){
                charMap.put(arr[i], 1);
            } else {
                charMap.put(arr[i], charMap.get(arr[i]) + 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : charMap.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        return maxChar;
    }
}
