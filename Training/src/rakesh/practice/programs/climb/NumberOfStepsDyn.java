package rakesh.practice.programs.climb;

public class NumberOfStepsDyn
{
    public static int findSteps(int n) {
        int [] res = new int[n + 1];
        res [0] = 1;
        res [1] = 1;
        res [2] = 2;
        for (int i = 3; i <= n; i++)
        {
            res[i] = res[i - 1] + res[i - 2] + res[i - 3];
        };
            return  res[n];

    }
    public static void main(String args[]) {
        int n = 3;
        System.out.println(findSteps(n));
    }
}
