package rakesh.practice.programs.All_Mine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortExample {

	public static void main(String[] args) {
		String [] arrayStr = new String[] {"rakesh","gomathi","lakshita"};
		Arrays.sort(arrayStr);
		int i = 0;
		
		for ( String temp : arrayStr) {
			System.out.println("names"+  ++i + temp );
		}
		
		
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("CRakesh");
		arrayList.add("ALakshita");
		arrayList.add("BGomathi");
		Collections.sort(arrayList);
		
		int j = 0;
		for (String temp: arrayList) {
			System.out.println("Names " + ++j + " " + temp);
		}
	}
	
}
