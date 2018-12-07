package rakesh.practice.programs.MyPractice;

public class Factorial {
    public static void main(String[] args) {
        int input = 5;
        int outPut = 1;
        for (int i = 1; i<= input; i++) {
            outPut = outPut * i;
        }
        System.out.println("Here is the factorial of : " + input + ": " + outPut);
    }
}
