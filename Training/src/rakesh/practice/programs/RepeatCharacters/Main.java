package rakesh.practice.programs.RepeatCharacters;

public class Main
{
    public static void main(String args[]) {
        String inputString = "abcdeabcde";
        inputString = inputString.toLowerCase();

        for(int i = 0; i <inputString.length(); i++) {
            char character = inputString.charAt(i);
            int firsIndex = inputString.indexOf(character);
            int lastIndex = inputString.lastIndexOf(character);

            if (firsIndex != lastIndex) {
                System.out.println("The character " + character + " is repeated on position " + lastIndex);
                break;
            }
        }
    }
}
