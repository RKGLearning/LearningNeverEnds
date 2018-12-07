package rakesh.practice.programs.master.training;

public class TryThis {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("What is the top of the range?");
        int range = 10000;
        if (range <= 0 ) {
            System.out.println("Bad Input");
        }
        int sumOfFactors = 0;
        for (int i = 1 ; i <= range ; i++) {
            for (int m = 1 ; m < i; m++) {
                if (i % m == 0) {
                    sumOfFactors = sumOfFactors + m;
                }
                if (sumOfFactors == i) {
                    System.out.println(i);
                }
                sumOfFactors = 0;
            }
        }
    }
}