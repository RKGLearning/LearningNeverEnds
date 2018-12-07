package rakesh.practice.programs.master.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main1 {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        int a,b,i,j = 0,k;
        Main1 obj = new Main1();

        while ((line = in.readLine()) != null) {
            String[] arr = line.split(" ");
            a = Integer.parseInt(arr[0]);
            b = Integer.parseInt(arr[1]);

            for (k =a;k<b;k++) {
                i = k;
                while((j-obj.magicNumber(i))/10!=0){
                    i =j;
                }
                if (j==1){
                    System.out.println(k);
                }
            }
        }
    }
    int magicNumber( int n) {
        if (n/10 == 0)
            return n;
        else
            return n%10 + magicNumber(n/10);
    }

    static final int NO_OF_CHARS = 256;
    static char count[] = new char[NO_OF_CHARS];

    /* calculate count of characters
       in the passed string */
    static void getCharCountArray(String str)
    {
        for (int i = 0; i < str.length();  i++)
            count[str.charAt(i)]++;
    }

    /* The method returns index of first non-repeating
       character in a string. If all characters are repeating
       then returns -1 */
    static int firstNonRepeating(String str)
    {
        getCharCountArray(str);
        int index = -1, i;

        for (i = 0; i < str.length();  i++)
        {
            if (count[str.charAt(i)] == 1)
            {
                index = i;
                break;
            }
        }

        return index;
    }
}
