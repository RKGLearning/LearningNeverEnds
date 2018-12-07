package string.examples;

public class Palindrom
{
    public static void main(String[] args) {
        String iString = "abaa";
        String oString = "";
        for (int i = iString.length()-1; i>=0;i--){
            oString = oString + iString.charAt(i);
        }
/*        if (oString.equalsIgnoreCase(iString)) {
            System.out.println(iString + " String is Palindrom");
        } else {
            System.out.println(iString + " String is not a Palindrom");
        }*/

/*        StringBuffer sb = new StringBuffer(iString);
        if (sb.reverse().toString().equalsIgnoreCase(iString)) {

            System.out.println(iString + " String is Palindrom");
        } else {
            System.out.println(iString + " String is not a Palindrom");
        }*/
        StringBuilder sb1 = new StringBuilder(iString);
        if (sb1.reverse().toString().equalsIgnoreCase(iString)) {

            System.out.println(iString + " String is Palindrom");
        } else {
            System.out.println(iString + " String is not a Palindrom");
        }
    }

}
