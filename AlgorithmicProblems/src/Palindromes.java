public class Palindromes {

        public static void main(String []args){
            System.out.println("------Ismail's code------");
            System.out.println();
            System.out.println(Palidroms("abccba"));
        }

        public static Boolean Palidroms(String name){
            char[] arr = name.toCharArray();
            int centerIndex = arr.length / 2;
            String part1 = "";
            String part2 = "";
            for(int i = 0; i< centerIndex; i++){
                part1 += arr[i];
                part2 += arr[arr.length -1 - i];
            }
            if(part1.equals(part2)){
                return true;
            }else{
                return false;
            }
        }
}
