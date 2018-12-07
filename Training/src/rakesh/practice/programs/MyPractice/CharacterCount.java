package rakesh.practice.programs.MyPractice;

public class CharacterCount{
    public static void main(String[] args) {
        String input = "abcabcabc";
        String outPut = "";
        int [] count = new int[256];
        for (int i =0; i<input.length(); i++) {
            count[input.charAt(i)]++;
        }
        char[] charArray = new char[input.length()];
        for (int j=0; j<input.length(); j++) {
            int find = 0;
            charArray[j] = input.charAt(j);
            for (int k=0; k<=j; k++) {
                if (charArray[k] == input.charAt(j) ) {
                    find++;
                }
            }
            if (find == 1)
            {
                outPut = outPut + input.charAt(j) + count[input.charAt(j)];
            }
        }
        System.out.println("Here is the outPut: " + outPut);
    }
}