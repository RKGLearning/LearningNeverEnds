package rakesh.practice.programs.All_Mine;

public class AllinOne {
	
	public static void main(String[]args) throws Exception {
		boolean flag = false;
		flag = checkString("aba");
		if (flag == true) {
			System.out.println("String is palindrom");
		} else {
			System.out.println("String is not palindrom");
		}
		flag = checkSb("aba");
		if (flag == true) {
			System.out.println("SB String is palindrom");
		} else {
			System.out.println("SB String is not palindrom");
		}
		
		getFact(5);
		getSeries(10);
	}
	
	/** Palindrom with String **/
	public static boolean checkString(String iString) {
		boolean isValid = false;
		String reverse = "";
		for (int i = iString.length() - 1; i >= 0; i--) {
			reverse = reverse + iString.charAt(i);
			
		}
		if (iString.equalsIgnoreCase(reverse)) {
			isValid = true;
		}
		return isValid;
	}
	
	/*** Palindrom with String Buffer **/
	public static boolean checkSb (String iString) throws Exception {
		boolean isValid = false;
		StringBuffer sb1 = new StringBuffer(iString);
		if (sb1.reverse().toString().equalsIgnoreCase(iString)) {
			isValid = true;
		}
		return isValid;
	}
	
	/** rakesh.practice.programs.master.training.Fabonanci Series ***/
	public static void getSeries (int inputNbr) {
		int n1 = 0, n2=1,n3=0,count=10;
		System.out.println(n1);
		System.out.println(n2);
		for (int i = 2; i <= count; i ++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);
		}
	}

	/**Factorial Number **/
	public static void getFact(int iNumber) throws Exception {
		int fact = 1;
		for (int i = 1; i <= iNumber; i++ ) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
