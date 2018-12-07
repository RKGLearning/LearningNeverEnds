package rakesh.practice.programs.climb;

public class ClimbSimpleWay
{

    public static void main(String[] args) {
        int input = 4;
        System.out.println("Number of ways to climb the stairs is : " + getSteps(4));
    }

    public static int getSteps(int input) {
        if (input == 0 || input ==1) {
            input = 1;
        } else {
            if (input == 2) {
                input = 2;
            } else {
                input = getSteps(input - 3) + getSteps(input - 2) + getSteps(input - 1);
            }
        }

        return  input;
    }

}


