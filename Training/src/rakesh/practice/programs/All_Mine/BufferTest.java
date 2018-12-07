package rakesh.practice.programs.All_Mine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
public class BufferTest {
	public static void main(String args[]) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the item details");
	System.out.println("Enter the name of the item : ");
	String itemName = reader.readLine();
	System.out.println("Enter the description : ");
	String desc = reader.readLine();
	System.out.println("Enter the item number : ");
	String itemNumber = reader.readLine();
	System.out.println("Enter the price : ");
	String price = reader.readLine();
	System.out.println("Item Details");
	System.out.println("Name : " + itemName);
	System.out.println("Description : " + desc);
	System.out.println("Item Number : " + String.valueOf(itemNumber));
	DecimalFormat df = new DecimalFormat("#.00");
	System.out.println("Price : " + df.format(Double.parseDouble(price))); 
}
}
