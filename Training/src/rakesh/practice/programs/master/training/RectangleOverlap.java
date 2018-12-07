package rakesh.practice.programs.master.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.Rectangle;

public class RectangleOverlap
{
/*    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        boolean isOverlap = false;
        while((line = bf.readLine()) != null) {
            String [] la = line.split(" ");
            Rectangle rectangle1 = new Rectangle(Integer.parseInt(la[0]),Integer.parseInt(la[1]),Integer.parseInt
                    (la[2]),Integer.parseInt(la[3]));
            Rectangle rectangle2 = new Rectangle(Integer.parseInt(la[4]),Integer.parseInt(la[5]),Integer.parseInt
                    (la[6]),Integer.parseInt(la[7]));

            if (rectangle1.intersects(rectangle2)) {
                isOverlap = true;
            } else {
                isOverlap = false;
            }
            System.out.println(isOverlap);
        }
    }*/
/*public static void main(String args[]) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    String line = null;
    boolean isOverlap = false;
    while((line = bf.readLine()) != null) {
        String [] la = line.split(" ");
        Rectangle r1 = new Rectangle(Integer.parseInt(la[0]),Integer.parseInt(la[1]),Integer.parseInt(la[2]),Integer.parseInt(la[3]));
        Rectangle r2 = new Rectangle(Integer.parseInt(la[4]),Integer.parseInt(la[5]),Integer.parseInt(la[6]),Integer.parseInt(la[7]));

        if (r1.intersects(r2)) {
            isOverlap = true;
        } else {
            isOverlap = false;
        }
        System.out.println(isOverlap);
    }
}*/

public static void main(String args[]) throws IOException {/*
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int input1 = 0;
    int input2 = 0;
    int sum = 0;
    String input = null;
    while((input = bf.readLine()) != null) {
        String [] ia = input.split(" ");
        input1 = Integer.parseInt(ia[0],2);
        input2 = Integer.parseInt(ia[1],2);
        sum = input1 + input2;
        System.out.println(Integer.toBinaryString(sum));*/

    BufferedReader bf = new BufferedReader(new InputStreamReader((System.in)));
    String input = null;
    boolean isOverlap = false;

    while ((input = bf.readLine()) != null) {
        String [] inputArray = input.split(" ");
        Rectangle rectangle = new Rectangle(Integer.parseInt(inputArray[0]),Integer.parseInt(inputArray[1]),Integer
                .parseInt(inputArray[2]),Integer.parseInt(inputArray[3]));
        Rectangle rectangle1 = new Rectangle(Integer.parseInt(inputArray[4]),Integer.parseInt(inputArray[5]),Integer
                .parseInt(inputArray[6]),Integer.parseInt(inputArray[7]));

        if (rectangle.intersects(rectangle1)) {
            isOverlap = true;
        } else {
            isOverlap = false;
        }
        System.out.println(isOverlap);
    }
    }


}
