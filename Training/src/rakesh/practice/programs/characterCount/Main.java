package rakesh.practice.programs.characterCount;

public class Main
{
    public static void main(String args[])
    {
        String inputString = "aaabbbccccccccccddddd";
        char previous = 0;
        int lastIndex = 0;
        int count[] = new int[256];
        int count1 = 0;
        String outPutString = "";
        for (int i = 0; i < inputString.length(); i++)
        {
            char character = inputString.charAt(i);
            if (previous == 0){
                count1++;
            } else {
                if (previous == character) {
                    count1 ++;
                }
            }
            if (previous !=0 && previous != character  ) {
                outPutString = outPutString + previous + count1;
                count1 = 1;
            }
            if (i == inputString.length() -1) {
                outPutString = outPutString + previous + count1;
            }
            previous = inputString.charAt(i);
        }
        System.out.println("Expected Output is :" + outPutString);
    }
}