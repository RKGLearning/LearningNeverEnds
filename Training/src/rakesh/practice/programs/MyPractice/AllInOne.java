package rakesh.practice.programs.MyPractice;

public class AllInOne{
    public static void main(String[] args) {
        /*** Steps Count ***/
        int inputS = 3;
        int [] outPut = new int[inputS + 1];
        outPut[0] =1;
        outPut[1] =1;
        outPut[2] = 2;
        for (int i =3; i<=inputS; i++) {
            outPut[i] = outPut[i-1] + outPut[i-2] + outPut[i-3];
        }
        System.out.println("Here is the outPut of Climb: " + outPut[inputS]);


        /**** Character Count *****/
        String inputC = "abcdeabcdeabcde";
        String outPutC = "";
        int[] count = new int[256];
        for (int i=0; i<inputC.length(); i++) {
            count[inputC.charAt(i)]++;
        }
        char[] charArray = new char[inputC.length()];
        for (int j =0;j<inputC.length(); j++) {
            int find = 0;
            charArray[j] = inputC.charAt(j);
            for (int k=0; k<=j; k++) {
                if (inputC.charAt(j) == charArray[k]) {
                    find ++;
                }
            }
            if (find == 1) {
                outPutC = outPutC + inputC.charAt(j) + count[inputC.charAt(j)];
            }
        }
        System.out.println("Character Count is: " + outPutC);

        /**** Factorial Number ****/

        int inp =5;
        int outPutF = 1;

        for (int i=1; i<=5; i++) {
            outPutF = outPutF * i;
        }
        System.out.println("Factorial is: " + outPutF);
    }


}
