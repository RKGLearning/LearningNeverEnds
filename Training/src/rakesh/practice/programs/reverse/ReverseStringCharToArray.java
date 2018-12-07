package rakesh.practice.programs.reverse;

/*
Convert the input string into character array by using the toCharArray(): Convert the input string into character
array by using the toCharArray() – built in method of the String Class. Then, scan the character array from both
sides i.e from the start index (left) as well as from last index(right) simultaneously.

1. Set the left index equal to 0 and right
   index equal to the length of the string -1.
2. Swap the characters of the start index
   scanning with the last index scanning
   one by one. After that, increase the left
   index by 1 (left++) and decrease the right
   by 1 i.e., (right--) to move on to the next
   characters in the character array .
3. Continue till left is less than or equal to
   the right.
 */
public class ReverseStringCharToArray
{
    public static void main(String args[]){
        String inputString = "TestForReverse";
        char [] inCharArray= inputString.toCharArray();
        int left, right = 0;
        right = inCharArray.length - 1;
        String outPutString = "";

        for (left = 0; left < right; left ++, right --) {
            char temp = inCharArray[left];
            inCharArray[left] = inCharArray[right];
            inCharArray[right] = temp;
        }
        for (char c : inCharArray) {
            outPutString = outPutString +c;
        }
        System.out.println(outPutString);
    }
}
