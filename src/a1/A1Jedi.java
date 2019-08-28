package a1;

import java.util.Scanner;

public class A1Jedi {

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
					int[] quan = new int [x];
					String[] grocery1 = new String [x];
					
						for (int j = 0; j < x; j++) {
							
							
							quan[j] = scan.nextInt();
							grocery1[j] = scan.next();
							
							
							// loops through my first grocery list and adds to the count and indv count.
							for (int k = 0; k < groceryList.length; k++) {
								
								if (grocery1[j].equals( groceryList [k].name)) {
									groceryList[k].count += quan[j];
									
									// makes so dont double count
									if (!groceryList[k].bo) {
										groceryList[k].indv += 1;
										groceryList[k].bo = true;
									}
								
								}
								//resets all indv buying
								for (int z = 0; z < groceryList.length; z++) {
									groceryList[z].bo = false;
								}
								
							}
							
							
							
						}
						// creates the shoppper into my shopper array list
						shopperList[i] = new Shopper(fNames[i], lNames[i], x, quan, grocery1);
					
					
				}
		
		
		for (int i = 0; i < groceryList.length; i++) {
			if (groceryList[i].count == 0 ) {
				System.out.println("No customers bought " + groceryList[i].name);
			} else {
				System.out.println(groceryList[i].indv + " " + "customers bought " + groceryList[i].count + 
						" " + groceryList[i].name);
			}
		}
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}
}
