package a1;

public class Shopper {
	
		String fName;
		char char1;
		String lName;
		int count;
		int[] quan;
		String[] items;
		double total = 0;
		
		public Shopper (String fName, String lName, int count, int[] quan, String[] items) {
			this.fName = fName;
			this.char1 = firstNameConverter (fName);
			this.lName = lName;
			this.count = count;
			
			/*for (int i = 0; i < count; i++ ) {
				this.quan[i] = quan[i];
			}
			
			for (int i = 0; i < count; i++ ) {
				this.items[i] = items[i];
			}
			*/
			
			this.quan = quan;
			this.items = items;
	
		}
		
		
		public char firstNameConverter(String custFName) {
			
			char x = custFName.charAt(0);
			
			
			return x;
			}
		  
	
	
}
