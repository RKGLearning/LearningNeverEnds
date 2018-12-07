package rakesh.practice.programs.All_Mine;

public class Palindrom {

	static boolean isP = false;
public static void main(String[]args) {
	String pString = "aba";
	String nString = "";
	for(int i = pString.length() - 1; i >=0; i--) {
		nString = nString + pString.charAt(i);
	}
	isP = checkP(pString,nString);
	if(isP == true) {
		System.out.println("String is Palindrom");
	} else {
		System.out.println("String is not a Palindrom");
	}
	isP = sbCheck(pString);
	if(isP == true) {
		System.out.println("Sb String is Palindrom");
	} else {
		System.out.println("Sb String is not a Palindrom");
	}
}


public static boolean checkP (String pString, String nString) {
	boolean flag = false;
	if (pString.equalsIgnoreCase(nString)) {
		flag = true;
	}
	return flag;
}

public static boolean sbCheck (String pString) {
	boolean flag = false;
	StringBuffer sb1 = new StringBuffer(pString);
		if (pString.equalsIgnoreCase(sb1.reverse().toString())) {
			flag = true;
		}
	
	return flag;
}
}
