public class SelectionSort {
    public static void main(String []args){
        System.out.println("------Ismail's code------");
        System.out.println();

        int[] result = selectionSort(new int[]{8, 2, 4, 1, 5, 3, 7, 2});

        for(int i = 0; i< result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] selectionSort(int[] arr){
        int helper;
        int minimumIndex;
        for(int i = 0; i< arr.length; i++){
            minimumIndex = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minimumIndex]){
                    minimumIndex = j;
                }
            }

            if(minimumIndex != i){
                helper = arr[i];
                arr[i] = arr[minimumIndex];
                arr[minimumIndex] = helper;
            }
        }

        return arr;
    }
}
