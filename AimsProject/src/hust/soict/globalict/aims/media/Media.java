package hust.soict.globalict.aims.media;

import java.util.Comparator;

public abstract class Media {
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

	int id;
	String title;
	String category;
	float cost;
	
	public Media() {
	}
	public Media(String title) {
		this.title = title;
	}
	public Media(String title, String category, float cost) {
		this.category = category;
		this.title = title;
		this.cost = cost;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public boolean equals(Media o){
        if (this.title == o.getTitle()) return true;
        return false;
    }

}
