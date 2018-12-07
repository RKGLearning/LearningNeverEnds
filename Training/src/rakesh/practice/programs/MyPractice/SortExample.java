package rakesh.practice.programs.MyPractice;
import java.util.*;
public class SortExample {
    public static void main(String[] args) {

        int [] intArray = {9,3,6,7,2,8};
        Arrays.sort(intArray);

        for (int i =0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        List<Integer> intList = new ArrayList<Integer>();

        intList.add(6);
        intList.add(3);
        intList.add(9);

        Collections.sort(intList);

        for (int j = 0; j< intList.size(); j++) {
            System.out.println(intList.get(j));
        }
    }
}
