package rakesh.practice.programs.master.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarryAdd
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int input1 = 0;
        int input2 = 0;
        String line = null;
        int sum =0;
        while((line = bf.readLine()) != null) {
            String[] lineArray = line.split(" ");
            input1 = Integer.parseInt(lineArray[0] , 2);
            input2 = Integer.parseInt(lineArray[1],2);
            sum = input1 + input2;
            System.out.println(Integer.toBinaryString(sum));
        }
    }
}
