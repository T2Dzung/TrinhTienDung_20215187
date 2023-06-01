package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

	private List<String> authors = new ArrayList<String>();
	
	public Book(String title, String category, float cost) {
		super(title, category, cost);
	}

	public Book(String title, String category, float cost, ArrayList<String> authors) {
		super(title, category, cost);
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		if(!authors.contains(authorName)) authors.add(authorName);
	}
	
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) authors.remove(authorName);
	}

	public String toString() {
		return "Book - Id: " + this.getId() + " - " + this.getTitle() + " - " + this.getCategory()  + " : " + this.getCost() + " $";
	}
	
}
