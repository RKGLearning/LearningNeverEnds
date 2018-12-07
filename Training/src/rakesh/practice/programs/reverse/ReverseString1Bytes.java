package rakesh.practice.programs.reverse;

/*
Converting String into Bytes: getBytes() method is used to convert the input string into bytes[].
Method:
 1. Create a temporary byte[]  of length equal
   to the length of the input string.
2. Store the bytes (which we get by using
   getBytes() method) in reverse order into
   the temporary byte[] .
3. Create a new String abject using byte[] to
   store result.
 */
public class ReverseString1Bytes
{
    public static void main(String args[]) {
        String input = "TestForRakesh";
        byte [] inputAsByteArray = input.getBytes();
        byte [] result = new byte[inputAsByteArray.length];
        for (int i = 0; i < inputAsByteArray.length; i ++) {
            result[i] = inputAsByteArray[inputAsByteArray.length-i-1];

        }
        System.out.println(new String(result));
    }
}
