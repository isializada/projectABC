public class ZaProblem2 {
    public static void main(String []args){
        System.out.println("------Ismail's code------");
        System.out.println();

        System.out.println(CountIntervals("RRRLRLRLLLRLLRRL"));
    }

    public static int CountIntervals(String S){
        int intervals = 0;
        int intervalCheck = 0;
        char[] charArr = S.toCharArray();

        for(char letter:charArr){
            switch (letter){
                case 'R': intervalCheck+=1;
                    break;
                case 'L': intervalCheck-=1;
                    break;
            }

            if(intervalCheck==0){
                intervals+=1;
            }
        }
        return intervals;
    }
}
