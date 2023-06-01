package hust.soict.globalict.aims.cart;

import java.util.ArrayList;
import java.util.Collections;

import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.Track;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

	
	public void addMedia(Media media) {
		if (!itemsOrdered.contains(media)) {
			itemsOrdered.add(media);
		}
	}
	
	public void removeMedia(Media media) {
		if (itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
		}
	}
	
	public float totalCost() {
		float sum=0;
		for(Media media:itemsOrdered) {
			sum+=media.getCost();
		}
		return sum;
	}
	
	public void sortByTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }

    public void sortByCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }
    
	public void print() {
		System.out.println("\n***********************CART***********************");
		System.out.println("Ordered items:");
		for (int i=1; i<=itemsOrdered.size(); i++) {
			System.out.println(i + ". " + itemsOrdered.get(i-1).toString());
		}
		System.out.println("Total cost: " + this.totalCost() + "$");
		System.out.println("***************************************************");
	}
	
	public void searchById(int id) {
		boolean found = false;
		for (Media media : itemsOrdered) {
			if (media.getId() == id) {
				System.out.println(media.toString());
				found = true;
			}
		}
		if (!found){
			System.out.println("Item not found");
		}
	}
	
	public void searchByTitle(String title) {
		boolean found = false;
		for (Media media : itemsOrdered) {
			if (media.getTitle().equals(title)) {
				System.out.println(media.toString());
				found = true;
			}
		}
		if (!found){
			System.out.println("Item not found");
		}
	}
    
    public void delete() {
    	itemsOrdered.clear();
    }
    
    public Media findByTitle(String title) {
    	for (Media media : itemsOrdered) {
			if (media.getTitle().equals(title))
				return media;
		}
		return null;
    }
}
