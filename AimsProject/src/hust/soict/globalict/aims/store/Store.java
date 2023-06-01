package hust.soict.globalict.aims.store;

import java.util.ArrayList;
import hust.soict.globalict.aims.media.Media;

public class Store {
	
	private ArrayList<Media> itemStored = new ArrayList<>();
	
	public void addMedia(Media media) {
		if (!itemStored .contains(media)) {
			itemStored .add(media);
		}
	}
	public void removeMedia(Media media) {
		if (itemStored .contains(media)) {
			itemStored .remove(media);
		}
	}
	public Media searchByTitle(String title) {
		for (Media media : itemStored) {
			if (media.getTitle().equals(title))
				return media;
		}
		return null;
	}
	public void print() {
		System.out.println("Items in store:");
		for (int i=1; i<=itemStored.size(); i++) {
			System.out.println(i + ". " + itemStored.get(i-1).toString());
		}
	}
}
