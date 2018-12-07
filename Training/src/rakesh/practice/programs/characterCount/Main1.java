package rakesh.practice.programs.characterCount;

public class Main1
{
    public static void main(String args[]) {
        String inputString = "aaaavvvvccccc";
        String outPutString= "";
        int count[] = new int[256];
        for (int i = 0; i < inputString.length(); i++) {
            count[inputString.charAt(i)]++;
        }

        char chara[] = new char[inputString.length()];
        for (int i = 0;i<inputString.length(); i++) {
            chara[i] = inputString.charAt(i);
            int find = 0;

            for (int j = 0; j<= i; j++) {
                if (inputString.charAt(i) == chara[j]) {
                    find ++;
                }
            }

            if (find == 1) {
                System.out.println("Number of Occurance of " + inputString.charAt(i) + " is: " +
                count[inputString.charAt(i)]);
                outPutString = outPutString + inputString.charAt(i) + count[inputString.charAt(i)];
            }
        }
        System.out.println("Expected Result is : " +  outPutString);
    }
}
