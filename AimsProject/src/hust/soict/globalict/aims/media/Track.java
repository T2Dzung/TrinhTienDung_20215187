package hust.soict.globalict.aims.media;

public class Track implements Playable {

	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	
	public void play() {
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}

	public boolean equals(Track o){;
        if (this.title == o.getTitle() && this.length == o.getLength()) return true;
        return false;
    }

}
