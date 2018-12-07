package rakesh.practice.programs.master.training;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
public class Main
{

/*    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        int input1 = 0;
        int input2 = 0;
        int sum = 0;
        while ((line = in.readLine()) != null) {
            String[] split = line.split(' ');
            input1 = Integer.parseInt(split[0],2);
            input2 = Integer.parseInt(split[1],2);
            sum = input1 + input2;
            System.out.println(Integer.toBinaryString(sum));
        }
    }*/

    public static void main(String[] args) throws IOException
    {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        Boolean valid = false;

        while ((line = in.readLine()) != null)
        {
            String[] split = line.split(" ");
            Rectangle rectangle1 = new Rectangle(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer
                    .parseInt(split[2]),
                    Integer.parseInt(split[3]));
            Rectangle rectangle2 = new Rectangle(Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]),
                    Integer.parseInt(split[7]));

            if (rectangle2.intersects(rectangle1))
            {
                valid = true;
            }
            else
            {
                valid = false;
            }

            System.out.println(valid);

        }
    }
}