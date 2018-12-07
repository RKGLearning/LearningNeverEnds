package rakesh.practice.programs.reverse;

/*
Converting String to character array: The user input the string to be reversed.
Method:
1. First, convert String to character array
   by using the built in Java String class
   method toCharArray().
2. Then, scan the string from end  to start,
   and print the character one by one.
 */
public class ReverseStringArray
{
    public static void main(String args[]) {
        String inputString = "TestReverse";
        String outputString = "";
        char [] inputStringArray = inputString.toCharArray();
        for (int i = inputStringArray.length-1;i>=0;i--) {
            outputString = outputString + inputStringArray[i];
//            System.out.print(inputStringArray[i]);
        }

        System.out.println(outputString);
    }
}
