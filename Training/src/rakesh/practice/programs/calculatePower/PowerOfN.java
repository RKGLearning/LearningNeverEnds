package rakesh.practice.programs.calculatePower;

public class PowerOfN
{
    public static void main(String[] args) {
        System.out.println(checkPower(10));
    }

    public static boolean checkPower(int n) {
        int checkPowerOf = 10;
        if (n == 0) {
            return  false;
        }
        while ( n != 1) {
            if (n % checkPowerOf != 0) {
                return false;
            }
            n = n /checkPowerOf;
        }
        return true;
    }
}
