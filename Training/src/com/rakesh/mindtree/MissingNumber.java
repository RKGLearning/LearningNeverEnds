package com.rakesh.mindtree;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber
{
    public static void main(String[] args) {
        int arrarSize = 5;
        int [] intArray = {1,2,4,5,6};

        int total = (arrarSize +1) *(arrarSize + 2)/2;
        for (int i=0; i<arrarSize;i++) {
            total -= intArray[i];
        }
        System.out.println(total);
        int  intArraySize = intArray[0];
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<intArray.length; i++) {
            if (intArraySize == intArray[i]){
                intArraySize++;
                continue;
            } else {
                arr.add(intArraySize);
                System.out.println("Missing Number is :" + intArraySize);
                i--;
                intArraySize++;
            }
        }
        System.out.println("Missing numbers are: " + arr);

    }


}
