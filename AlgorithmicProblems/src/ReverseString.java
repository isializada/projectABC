public class ReverseString {
        public static void main(String []args){
            System.out.println(reverseString("Ismail"));
        }
        public static String reverseString(String name){
            char[] arr = name.toCharArray();
            String reversed = "";
            for(int i = arr.length-1; i>= 0; i--){
                reversed += arr[i];
            }
            return reversed;
        }
}
