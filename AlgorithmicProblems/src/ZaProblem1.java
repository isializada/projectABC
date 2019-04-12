public class ZaProblem1 {
    public static void main(String []args){
        System.out.println("------Ismail's code------");
        System.out.println();

        System.out.println(FindMinimumSteps(8,1));
    }

    public static int FindMinimumSteps(int N, int K){
        int rounds = 0;

        while(N>=2){
            if(K == 0){
                rounds += N-1;
                break;
            }

            if(N%2==0 && K>0){
                N=N/2;
                K-=1;
            } else{
                N-=1;
            }
            rounds+=1;
        }
        return rounds;
    }
}
