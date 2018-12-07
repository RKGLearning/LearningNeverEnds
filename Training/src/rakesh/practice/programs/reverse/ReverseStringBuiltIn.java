package rakesh.practice.programs.reverse;

/*
Using built in reverse() method of the StringBuilder class: String class does not have reverse() method, we need to
convert the input string to StringBuilder, which is achieved by using the append method of StringBuilder. After that,
 print out the characters of the reversed string by scanning from the first till the last index.
 */
public class ReverseStringBuiltIn
{
    public static void main(String args[]) {
        String input = "TestString";
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb = sb.reverse();
        System.out.println(sb);
    }
}
