package rakesh.practice.programs.All_Mine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main1 {
	
    public static void main(String[] args) {

    	
        Scanner sc = new Scanner(System.in);
        int numLines = Integer.parseInt(sc.nextLine());
        List<String> listNames = new ArrayList<String>();
        int[] arr1 = new int[numLines];
        String[] airCrafts = new String[numLines];
        for(int i = 0;i<numLines;i++){
        	airCrafts[i] = sc.nextLine();
        }
        String[] newArr = new String[airCrafts.length];
        for (int n = 0;n<airCrafts.length; n++) {
        	String getTheValue = airCrafts[n];
        	listNames = new ArrayList<String>(Arrays.asList(getTheValue.split(" | ")));
        	
        }
        System.out.println(listNames.get(0));
        System.out.println(listNames.get(1));
       
        double[] charges = new double[airCrafts.length];
        for (int j = 0;j<airCrafts.length; j++) {
        	charges[j] = sc.nextDouble();
        }
        
        String[] combine = new String[airCrafts.length];
        for (int l = 0;l < charges.length; l++) {
        	combine[l] = airCrafts[l] + " " + charges[l];
        }
       
        System.out.println("Details are :");
        Arrays.sort(charges);

        for (int k = 0;k<charges.length; k++) {
        	for(int m = 0; m < combine.length;m++) {
        		if (combine[m].contains(String.valueOf(charges[k]))) {
        			System.out.println(airCrafts[m] + "-" +  charges[k]);
        		}
        	}
        	
        }
    }
    
    
    public static int missingNumber(int[] arr)
    {
     int n=arr.length+1;
     int sum=n*(n+1)/2;
     int restSum=0;
     for (int i = 0; i < arr.length; i++) {
      restSum+=arr[i];
     }
     int missingNumber=sum-restSum;
     return missingNumber;
    }
    
    
//	public static void main(String args[]) {
//		int m, n, sum = 0;
//		Scanner s = new Scanner(System.in);
//		m = s.nextInt();
//		if (m > 0) {
//			while (m > 0) {
//				n = m % 10;
//				sum = sum + n;
//				m = m / 10;
//			}
//			int last = sum % 10;
//
//			if (last == 5 || last == 8) {
//				System.out.println("Lucky Customer");
//			} else {
//				System.out.println("Unlucky Customer");
//			}
//		} else {
//			System.out.println("Invalid Input");
//		}
//	}
}
		
//		do {
//		    System.out.println("Please enter a positive number!");
//		    while (!sc.hasNextInt()) {
//		        System.out.println("That's not a number!");
//		        sc.next(); // this is important!
//		    }
//		    number = sc.nextInt();
//		} while (number < 0);
//		System.out.println("Thank you! - Got " + number);
//		
//		do {
//		    System.out.println("Please enter a positive number!");
//		    while (!sc.hasNextInt()) {
//		        System.out.println("That's not a number!");
//		        sc.next(); // this is important!
//		    }
//		    number = sc.nextInt();
//		} while (number < 0);
//		System.out.println("Thank you! Got " + number);
		
    	
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the number of shipments per month :");
//		String input = reader.readLine();
//		if (input != null && (input.matches("-?\\d+"))) {
//			if (Integer.parseInt(input) > 20) {
//				System.out.println("Valuable customer");
//			} else {
//				if (Integer.parseInt(input)  > 0 && Integer.parseInt(input)  < 20) {
//					System.out.println("Not a valuable customer");
//				} else {
//					if (Integer.parseInt(input)  < 0) {
//						System.out.println("Invalid Input");
//					}
//				}
//			}
//		}
//
//		reader = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the number of shipments per month :");
//		String input1 = reader.readLine();
//		
//		if (input1 != null && (input1.matches("-?\\d+"))) {
//			if (Integer.parseInt(input1) > 20) {
//				System.out.println("Valuable customer");
//			} else {
//				if (Integer.parseInt(input1)  > 0 && Integer.parseInt(input1)  < 20) {
//					System.out.println("Not a valuable customer");
//				} else {
//					if (Integer.parseInt(input1)  < 0) {
//						System.out.println("Invalid Input");
//					}
//				}
//			}
//		}
//		/****3rd*****/
//		reader = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the number of shipments per month :");
//		String input2 = reader.readLine();
//		
//		if (input2 != null && (input2.matches("-?\\d+"))) {
//			if (Integer.parseInt(input2) > 20) {
//				System.out.println("Valuable customer");
//			} else {
//				if (Integer.parseInt(input2)  > 0 && Integer.parseInt(input2)  < 20) {
//					System.out.println("Not a valuable customer");
//				} else {
//					if (Integer.parseInt(input2)  < 0) {
//						System.out.println("Invalid Input");
//					}
//				}
//			}
//		}
		

