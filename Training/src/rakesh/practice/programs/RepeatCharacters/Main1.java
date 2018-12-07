package rakesh.practice.programs.RepeatCharacters;

public class Main1
{
    public static void main(String args[]) {
        String inputString = "RakeshSgedam";
        inputString = inputString.toLowerCase();
        for (int i=0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            int firstIndex = inputString.indexOf(character);
            int lastIndex = inputString.lastIndexOf(character);

            if (firstIndex != lastIndex) {
                System.out.println("Character " + character + " repeated on postion " + lastIndex);
                break;
            }
        }
    }
}
