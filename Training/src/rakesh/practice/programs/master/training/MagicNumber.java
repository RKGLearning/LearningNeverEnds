package rakesh.practice.programs.master.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class MagicNumber
{

    public static void main(String[] args) throws IOException
    {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        int a = 0;
        int b = 0;
        int i,j,k =0;
        MagicNumber obj=new MagicNumber();
        while ((line = in.readLine()) != null)
        {
            String[] inputArray = line.split(" ");
            a = Integer.parseInt(inputArray[0]);
            b = Integer.parseInt(inputArray[1]);

            for(k=a;k<b;k++)
            {i=k;
                while((j=obj.magicno(i))/10!=0)
                {
                    i=j;
                }
                if ( j==1)
                    System.out.println(k);
            }

        }
        }

    int magicno(int n)
    {
        if(n/10==0)
            return n;
        else
            return n%10 + magicno(n/10);
    }
}
