package hust.soict.globalict.aims.cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		for(DigitalVideoDisc i: dvdList) {
			addDigitalVideoDisc(i);
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
		
	}
	
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
	
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for(int j=0; j<qtyOrdered; j++) {
			DigitalVideoDisc i = itemOrdered[j];
			System.out.println((j+1)+". DVD - "+i.getTitle()+" - "+i.getCategory()+" - "+i.getDirector()+" - "+i.getLength()+": "+i.getCost()+"$");
		}
		System.out.println("Total cost: "+totalCost());
		System.out.println("**************************************************");
	}
	
	
	public void search(String title) {
		boolean check = false;
		for(int i=0; i<qtyOrdered; i++) {
			if(itemOrdered[i].isMatch(title)) {
				System.out.println(itemOrdered[i].getTitle()+" is in the cart.");
				check = true;
			}
		}
		if(!check) System.out.println("No match is found.");
	}
	
	
	public void search(int id) {
		for(int i=0; i<qtyOrdered; i++) {
			if(itemOrdered[i].getId() == id) {
				System.out.println(itemOrdered[i].getTitle()+" is in the cart.");
				return;
			}
		}
		System.out.println("No match is found.");
	}
	
}
