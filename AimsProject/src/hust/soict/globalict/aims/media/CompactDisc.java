package hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {

	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();
	
	public String getArtist() {
		return artist;
	}
	
	public CompactDisc(String title) {
		super(title);
	}
	public CompactDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public CompactDisc( String title, String category, String director, float cost) {
		super(title, category, director, cost);
	}
	public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
		super(title, category, director, length, cost);
		this.artist = artist;
	}
	
	public void addTrack(Track track) {
		if (tracks.contains(track)) {
			System.out.println("Track is already added.");
		} else {
			tracks.add(track);
			System.out.println("Added " + track);
		}
	}
	
	public void removeTrack(Track track) {
		if (tracks.contains(track)) {
			tracks.remove(track);
			System.out.println("Removed " + track);
		} else {
			System.out.println("Track does not exist.");
		}	
	}
	
	public int getLength() {
		int sum = 0;
        for (Track track : tracks) {
        	sum += track.getLength();
        }
		return sum;
	}
	
	public String toString() {
		return "CD - Id: " + this.getId() + " - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getArtist() + " - " + this.getLength() + " : " + this.getCost() + " $";
	}
	
	public void play() {
		for(Track track:tracks) {
			track.play();
		}
	}
	
}
