package rakesh.practice.programs.All_Mine;

public class Factorial {
public static void main(String[]args) throws Exception {
	int fact = 0;
	fact = getValue(3);
	System.out.println(fact);
	
}
public static int getValue(int input) {
	int value = 1;
	
	for (int j =1; j <= input; j++) {
		value = value * j;
	}
	return value;
	
}
}
