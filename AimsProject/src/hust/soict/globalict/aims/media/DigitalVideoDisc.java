package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	
	private String director;
	private int length;
	private static int nbDigitalVideoDiscs = 0;
	
	public DigitalVideoDisc(String title) {
		super(title);
		nbDigitalVideoDiscs++;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
		nbDigitalVideoDiscs++;
	}
	public DigitalVideoDisc( String title, String category, String director, float cost) {
		super(title, category, director, cost);
		nbDigitalVideoDiscs++;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
		nbDigitalVideoDiscs++;
	}
	
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	
	public boolean isMatch(String title) {
		if(this.title.toLowerCase().contains(title.toLowerCase())) {
			return true;
		}else {
			return false;
		}
	}
	public String toString() {
		return "DVD - Id: " + this.getId() + " - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " : " + this.getCost() + " $";
	}
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}

	
}
