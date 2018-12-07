package rakesh.practice.programs.MyPractice;

public class Palindrom {
    public static void main(String[] args) {
        String input = "aba";
        String outPut = "";
        StringBuffer sb = new StringBuffer(input);
        if (sb.reverse().toString().equalsIgnoreCase(input)) {
            System.out.println(input + " String is palindrom");
        }

        for (int i = input.length() -1; i >=0; i--) {
            outPut = outPut + input.charAt(i);
        }

        if (outPut.equalsIgnoreCase(input)) {
            System.out.println(input + " String is palindrom");
        }


    }
}
