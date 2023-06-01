package hust.soict.globalict.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{
	
	@Override
	public int compare(Media o1, Media o2) {	
		int check = Float.compare(o2.getCost(), o1.getCost());
		return check != 0 ? check : o1.getTitle().compareTo(o2.getTitle());
	}
}
