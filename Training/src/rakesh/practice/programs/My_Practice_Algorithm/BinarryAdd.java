package rakesh.practice.programs.My_Practice_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarryAdd
{
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        int input1 = 0;
        int input2 =0;
        int sum = 0;

        while ((input = bf.readLine()) != null) {
            String [] inputArray = input.split(" ");
            input1 = Integer.parseInt(inputArray[0]);
            input2 = Integer.parseInt(inputArray[1]);

        }
    }
}
