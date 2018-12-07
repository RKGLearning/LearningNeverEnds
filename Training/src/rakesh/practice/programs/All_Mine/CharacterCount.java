package rakesh.practice.programs.All_Mine;

import java.util.*;
public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string to read the counts");
        String input = sc.nextLine();
        String outPut = "";
        int[] count = new int[256];
        for (int i = 0; i< input.length(); i++) {
            count[input.charAt(i)]++;
        }
        char[] charArray = new char[input.length()];
        for(int i=0;i<input.length(); i++) {
            charArray[i] = input.charAt(i);
            int find = 0;
            for(int j = 0; j<=i; j++) {
                if (charArray[j] == input.charAt(i)) {
                    find ++;
                }
            }
            if (find == 1) {
                outPut = outPut + input.charAt(i) + count[input.charAt(i)];
            }
        }
        System.out.println("Here is the outPut : " + outPut);

    }
}