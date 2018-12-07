package rakesh.practice.programs.climb;

public class ClimbMy
{
    public static void main(String[] args) {
        int input = 7;
        int [] count = new int[input + 1];
        count [0] = 1;
        count [1] = 1;
        count [2] = 2;
        for (int i = 3; i <= input ; i++) {
            count[i] = count [i -1] + count [i -2] + count [i -3];
        }
        System.out.println("number of ways to climb is : " + count[input]);

    }
}
