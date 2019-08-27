package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int count = scan.nextInt();
		
		
		int[] custNum = new int [count];
		String[] custFName = new String [count];
		String[] custLName = new String [count];
		int[] totalNum = new int [count];
		int[] itemNum = new int [totalNum.length];
		String [] itemName = new String [totalNum.length];
		double[] itemPrice = new double [totalNum.length];
		double[] totalPrice = new double [count];
		
		for (int i = 0; i < custNum.length; i++) {
			custFName[i] = scan.next();
			custLName[i] = scan.next();
			totalNum[i] = scan.nextInt();
			for (int z = 0; z < totalNum[i]; z++) {
				itemNum[z] = scan.nextInt();
				itemName[z] = scan.next();
				itemPrice[z] = scan.nextDouble();
			}
			totalPrice[i] = sum(itemNum, itemPrice);
			
			
		}
		//end of scan
		
		scan.close();
		
		for (int i = 0; i < custNum.length; i++) {
			System.out.println(firstNameConverter(custFName, i) + custLName[i] + ": " + totalPrice[i]) ;
		}
		
		
		
		
		
		
		
		
	}
	
	// new method First name converter
	
static String firstNameConverter(String[] custFName, int num) {
	
	char x = custFName[num].charAt(0);
	
	
	return x + ".";
	}
  

// sum method
static double sum(int[] itemNum, double[] itemPrice) {
	double x = 0.0;
	for ( int i = 0; i < itemNum.length; i++) {
		x += (itemNum[i] * itemPrice[i]);
	}
	
	
	return x;
	
}
}
