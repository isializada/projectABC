public class Fibonacci {
    public static int fibArray[] = new int[50];

    public static void main(String []args){
        System.out.println("------Ismail's code------");
        System.out.println();

        System.out.println(findByIndex(9));
    }

    public static Integer findByIndex(int index){
        int fibValue = 0;
        if(index < 2){
            return index;
        }
        if(fibArray[index] != 0){
            return fibArray[index];
        }
        fibValue = findByIndex(index - 1) + findByIndex(index - 2);
        fibArray[index] = fibValue;
        return fibValue;
    }
}
