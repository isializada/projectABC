import java.util.ArrayList;
import java.util.List;

public class ChunkProblem {
    public static void main(String []args){
        System.out.println("------Ismail's code------");
        System.out.println();
        int[] arr = {1,2,3,4,5,6,7,8,6};
        List<int[]> result = Chunk(arr, 4);
    }

    public static List<int[]> Chunk(int[] intArr, int size){
        int index = 0;
        int chunkArrIndex = 0;
        int[] chunkedArr = new int[size];
        List<int[]> list = new ArrayList<>();
        while(index < intArr.length){

            if(index % size == 0){
                chunkArrIndex = 0;
                list.add(chunkedArr);
                chunkedArr = new int[size];
            }else{
                chunkedArr[chunkArrIndex] = intArr[index];
                chunkArrIndex++;
            }
            index++;
        }
        return list;
    }
}
