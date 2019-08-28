package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		
		
		
		
	
		
		Scanner scan = new Scanner(System.in);
		
		// created grocery list of all items in the store
		
		int countItems = scan.nextInt();
		
		Grocery[] groceryList = new Grocery [countItems];

		for (int i = 0; i < countItems; i++) {
			groceryList[i] = new Grocery (scan.next(), scan.nextDouble() );
		}
		
		
		// created list of customers with their lists
		
		int countShoppers = scan.nextInt();
		
		Shopper[] shopperList = new Shopper [countShoppers];
		String[] fNames = new String [countShoppers];
		String[] lNames = new String [countShoppers];
		
		
		for (int i = 0; i < countShoppers; i++) {
			
			fNames[i] = scan.next();
			lNames[i] = scan.next();
			int x = scan.nextInt();
			int[] temp = new int [x];
			String[] grocery1 = new String [x];
			
				for (int j = 0; j < x; j++) {
					temp[j] = scan.nextInt();
					grocery1[j] = scan.next();
					
				}
				shopperList[i] = new Shopper(fNames[i], lNames[i], x, temp, grocery1);
			
			
		}
		
		// calculate totals for each shopper
		
		for (int i = 0; i < shopperList.length; i++) {
			double x = 0;
			
			int j = 0;
			while (j < shopperList[i].count) {
				x += ( shopperList[i].quan[j] * (shoToGro(shopperList[i].items[j], groceryList).price ));
				j++;
			}
			shopperList[i].total = x;
				
		}
		scan.close();
		
		
		
		// printing answers
		
		Shopper big = Max(shopperList);
		Shopper small = Least(shopperList);
		
		
		
		System.out.println("Biggest: " + big.fName + big.lName + " (" + String.format(
				"%.2f", big.total) + ")" );
		
		System.out.println("Smallest: " + small.fName + small.lName + " (" + String.format(
				"%.2f", small.total) + ")" );
		
		
		System.out.println("Average: " + String.format("%.2f", Average(shopperList)));
		
	
	
	
	}
	
		
	
	// finds the correct grocery item
	// assumes that the item is in the store.
	static  Grocery shoToGro (String x, Grocery[] list) {
		for (int i = 0; i < list.length; i++) {
			
			if (x.equals(list[i].name)) {
				return list[i];
			} 
		}
		return list[1];
	
		
	}
	// returns shopper with the max total
	// assumes that the list has more than one shopper on it and that numbers are real and all numbers are different.
	
	static Shopper Max (Shopper[] shopperList) {
		Shopper max = shopperList[0];
		
			for (int i = 1; i < shopperList.length; i++ ) {
				if (max.total < shopperList[i].total) {
					max = shopperList[i];
				}
			}
		
		
		
		return max;
	}
	
	
	// returns shopper with least total
	// assumes that list has more than one shopper on it and numbers are real and all numbers are different. 
	
	static Shopper Least (Shopper[] shopperList) {
		Shopper least = shopperList[0];

		for (int i = 1; i < shopperList.length; i++ ) {
			if (least.total > shopperList[i].total) {
				least = shopperList[i];
			}
		}
		
		
		return least;
	}
	
	
	//returns average of all shopper totals
	// assumes numbers are positive there are shoppers on the list.
	
	static double Average (Shopper[] shopperList) {
		double x = 0;
			for (int i = 0; i < shopperList.length; i++) {
				x += shopperList[i].total;
			}
		
		
		return x / shopperList.length;
	}
	
}
