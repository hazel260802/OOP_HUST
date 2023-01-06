
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
}
