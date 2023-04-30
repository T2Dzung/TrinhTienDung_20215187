
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println( "The disc has been added");
		}else {
			System.out.println( "The cart is full");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int k=0;
		int rmDisc=0;
		for(int i=0; i<qtyOrdered; i++) {
			if(itemOrdered[i] != disc) {
				itemOrdered[k] = itemOrdered[i];
				k++;
			}else {
				rmDisc++;
				System.out.println("The disc has been removed");
			}
		}
		qtyOrdered-=rmDisc;
	}
	public float totalCost() {
		float sum=0;
		for(int i=0; i<qtyOrdered; i++) {
			sum+=itemOrdered[i].getCost();
		}
		return sum;
	}
}
