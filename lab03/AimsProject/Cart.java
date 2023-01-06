
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc)  {
		if(this.qtyOrdered == MAX_NUMBERS_ORDERED){
			System.out.println("The order is full.");
			return;
		}
		itemsOrdered[qtyOrdered] = disc;
		qtyOrdered += 1;
		System.out.println("The disc has been added");
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList)  {
		if(this.qtyOrdered == MAX_NUMBERS_ORDERED){
			System.out.println("The order is full.");
			
			return;
		}
		else
			
		{
			this.itemsOrdered = dvdList;
			System.out.println("Disc array added.");
		}

	}
//	public void addDigitalVideoDisc(DigitalVideoDisc ...dvdList)  {
//		if(this.qtyOrdered == MAX_NUMBERS_ORDERED){
//			System.out.println("The order is full.");
//			return;
//		}
//		else
//		{
//			this.itemsOrdered = dvdList;
//			System.out.println("Disc array added.");
//		}
//
//	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2)  {
		if(this.qtyOrdered >= MAX_NUMBERS_ORDERED){
			System.out.println("The order is full.");
			return;
		}
		else {
			itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered += 1;
			if(this.qtyOrdered == MAX_NUMBERS_ORDERED){
				System.out.println("The order is full.");
				return;
			}
			else {
				itemsOrdered[qtyOrdered] = dvd2;
				qtyOrdered += 1;
				System.out.println("The items added.");
			}
		}

	}	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc)  {
		if(this.qtyOrdered == 0){
			System.out.println("The list is empty.");
			return;
		}
		else
		{
			for (int i = 0; i< this.qtyOrdered; i++) {
				if(itemsOrdered[i] == disc) {
					itemsOrdered[i] = null;
					System.out.println("The item has been removed.");
				}
			}
		}
		
	}
	public float totalCost()
	{
		float totalCost = 0;
		for ( int i = 0; i < this.qtyOrdered; i++ )
		{
			if ( itemsOrdered[i] == null )
			{
				continue;
			}
			totalCost = totalCost + itemsOrdered[i].getCost();
		}
		return totalCost;
	}
	public void print(){
		int number = this.itemsOrdered.length;
		
		
		
		if(qtyOrdered == 0 ) System.out.println("Cart is empty! Please add DVD to Cart!");
		else {	
			System.out.println("*******************************************CART*********************************************************");
			System.out.println("Ordered Items: ");
			for ( int i = 0; i < number; i++ )
			{
				if ( itemsOrdered[i] == null )
				{
					continue;
				}
				System.out.print((i + 1) + ".DVD  " + itemsOrdered[i].toString());
				
			}
			System.out.println("Total cost: " + totalCost());
			System.out.println("********************************************************************************************************");
		}	
	}
	public void search(String title) {
		int check = 0;
		
		for(int i = 0; i < qtyOrdered; ++i) {
			if(itemsOrdered[i].isMatch(title)) {
				check = 1;
				System.out.println(itemsOrdered[i].toString());
			}
		}
		
		if(check == 0) {
			System.out.println("Items not found!");
		}
	}
	
	public void search(int id) {
		int check = 0;
		for(int i = 0; i < qtyOrdered; ++i) {
			if(itemsOrdered[i].isMatch(id)) {
				check = 1;
				System.out.println(itemsOrdered[i].toString());
				break;
			}
		}
		
		if(check == 0) {
			System.out.println("Items not found!");
		}
		
	}
	
}
