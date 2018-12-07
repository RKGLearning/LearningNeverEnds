package string.examples;

public class LongestPalindrom
{
    public static void main(String [] args) {
        System.out.println(longestPalindrom("1234"));
        System.out.println(longestPalindrom("12321"));
        System.out.println(longestPalindrom("9912321456"));
        System.out.println(longestPalindrom("9912333321456"));
        System.out.println(longestPalindrom("12145445499"));
        System.out.println(longestPalindrom("1223213"));
        System.out.println(longestPalindrom("abb"));
    }
    public static String longestPalindrom(String s) {
        if (s == null) {
            return null;
        }
        String longest = s.substring(0,1);
        for (int i=0;i<s.length() -1; i++) {
            String palindrom = intermediatePalindrom(s,i,i);
            if (palindrom.length() > longest.length()) {
                longest = palindrom;
            }
            palindrom = intermediatePalindrom(s,i,i+1);
            if (palindrom.length() > longest.length()){
                longest = palindrom;
            }
        }
        return longest;
    }

    public static String intermediatePalindrom (String s, int left, int right) {
        if (left > right) {
            return null;
        }
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left + 1, right );
    }
}
