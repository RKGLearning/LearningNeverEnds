package rakesh.practice.programs;

public class Main
{
    public static void main(String[] args) {
        String s1 = "amod";
        String s2 = "amod";
        String s3 = new String(s1);

        if (s1 == s2) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
    }
}
