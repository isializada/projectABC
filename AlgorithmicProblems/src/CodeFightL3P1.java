public class CodeFightL3P1 {
        public static void main(String []args){
            System.out.println("------Ismail's code------");
            System.out.println();
            String s = "abdasd(qqs(dasq)cx)d";
            int[][] image = {{7, 4, 0, 1}, {5, 6, 2, 2}, {6, 10, 7, 8}, {1, 4, 2, 0}};
            int[] a = {0};
            int[] b = {2};
            int[][] response = constructSubmatrix(image,a,b);
            for(int i=0; i< response.length; i++) {
                for (int j = 0; j < response[0].length; j++) {
                    System.out.println(response[i][j]);
                }
            }

        }


    static int[][] constructSubmatrix(int[][] matrix, int[] rowsToDelete, int[] columnsToDelete) {
        int[][] response = new int[matrix.length - rowsToDelete.length][matrix[0].length - columnsToDelete.length];
        int index1 = 0;
        int index2 = 0;
        boolean helperCheckChangedIndex1 = false;
        boolean helperCheckChangedIndex2 = false;
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[0].length; j++){
                helperCheckChangedIndex1 = true;
                helperCheckChangedIndex2 = true;
                for(int k=0; k<rowsToDelete.length; k++){
                    if(rowsToDelete[k] == i){
                        helperCheckChangedIndex1 = false;
                        break;
                    }
                }

                for(int k=0; k<columnsToDelete.length; k++){
                    if(columnsToDelete[k] == j){
                        helperCheckChangedIndex2 = false;
                        break;
                    }
                }

                if(helperCheckChangedIndex1 && helperCheckChangedIndex2){
                    response[index1][index2] = matrix[i][j];
                    index2++;
                }
            }
            index2 = 0;
            if(helperCheckChangedIndex1){
                index1++;
            }
        }

        return response;

    }
}
