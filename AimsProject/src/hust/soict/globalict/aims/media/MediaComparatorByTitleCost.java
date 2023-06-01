package hust.soict.globalict.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {

	@Override
	public int compare(Media o1, Media o2) {		
		int check = o1.getTitle().compareTo(o2.getTitle());
		return check != 0 ? check : Float.compare(o2.getCost(), o1.getCost());
	}

}
