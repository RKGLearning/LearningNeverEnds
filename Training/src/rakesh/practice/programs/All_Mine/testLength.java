package rakesh.practice.programs.All_Mine;

public class testLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String zipcode = leftpad("1234567890",5);
		System.out.println(zipcode);
	}
	private static String leftpad(String text, int length) {
	    return String.format("%" + length + "." + length + "s", text);
	}

	private String rightpad(String text, int length) {
	    return String.format("%-" + length + "." + length + "s", text);
	}
}
