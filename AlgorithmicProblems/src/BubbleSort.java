public class BubbleSort {
    public static void main(String []args){
        System.out.println("------Ismail's code------");
        System.out.println();

        int[] result = bubbleSort(new int[]{8, 2, 4, 1, 5, 3, 7, 2});

        for(int i = 0; i< result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] bubbleSort(int[] arr){
        int helper;
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j < (arr.length - i - 1); j++){
                if(arr[j] > arr[j + 1]){
                    helper = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = helper;
                }
            }
        }

        return arr;
    }
}
