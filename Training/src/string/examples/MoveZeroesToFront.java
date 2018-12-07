package string.examples;

public class MoveZeroesToFront
{
    public static void main(String[] args) {
        int [] intArray = {1,2,6,7,3,5,0,6,0,1,2,0};
        int current = intArray.length - 1;
        for (int i=intArray.length -1; i >=0; i--) {

            if (intArray[i] != 0) {
                intArray[current] = intArray[i];
                current --;
            }
        }
        while(current >=0) {
            intArray[current] = 0;
            current--;
        }
        for  (int i=0; i<intArray.length;i++) {
            System.out.println(intArray[i] + " ");
        }
    }
}
