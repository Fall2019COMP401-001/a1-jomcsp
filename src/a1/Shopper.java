package a1;

public class Shopper {
	
		String fName;
		char char1;
		String lName;
		int count;
		int[] quan;
		String[] items;
		double total = 0;
		has
		
		public Shopper (String fName, String lName, int count, int[] quan, String[] items) {
			this.fName = fName;
			this.char1 = firstNameConverter (fName);
			this.lName = lName;
			this.count = count;
			
			
			
			this.quan = quan;
			this.items = items;
	
		}
		
		
		public char firstNameConverter(String custFName) {
			
			char x = custFName.charAt(0);
			
			
			return x;
			}
		  
	
	
}
