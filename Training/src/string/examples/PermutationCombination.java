package string.examples;

import java.util.HashSet;
import java.util.Set;

public class PermutationCombination
{

    public static Set<String> permuTaionFinder(String s) {
        Set<String> perm = new HashSet<String>();

        if (s == null) {
            return null;
        } else {
            if (s.length() == 0) {
                perm.add("");
                return perm;
            }
        }

        char initial = s.charAt(0);
        String rem = s.substring(1);
        Set<String> words = permuTaionFinder(rem);

        for (String newWord : words) {
            for(int i =0; i<=newWord.length(); i++) {
                perm.add(charInsert(newWord,initial,i));
            }
        }

        return perm;
    }
    public static String charInsert(String s2,char c, int j){
        String begin = s2.substring(0,j);
        String end = s2.substring(j);
        return begin + c + end;
    }
    public static void main(String[] args) {

        String ss1 = "ABC";
        String ss2 = "AAC";
        String ss3 = "ABCD";
        System.out.println("\n permutations for " + ss1 + "are: \n" + permuTaionFinder(ss1));
        System.out.println("\n permutations for " + ss2 + "are: \n" + permuTaionFinder(ss2));
        System.out.println("\n permutations for " + ss3 + "are: \n" + permuTaionFinder(ss3));
    }
}
