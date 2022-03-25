package dome;

public class CD extends Item {
	private String artist;
	private int playingTime;
	public CD() {
		super();
		artist = "";
		playingTime = 0;
	}
	
	public CD(String name, String comment, double value, String artist, int playingTime) {
		super(name,comment,value);
		this.artist = artist;
		this.playingTime = playingTime;
	}
	
	public String getArtist() {
		return artist;
	}
	public int getPlayingTime() {
		return playingTime;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setPlayingTime(int playingTime) {
		this.playingTime = playingTime;
	}
	
	public String toString() {
		String x = super.getName() + ", " + artist + ", R" + super.getValue() + ", " + playingTime + ", " + super.getComment();
		return x;
	}
	public void depreciate() {
		double value = 0.90*super.getValue();
		super.setValue(value);
	}
}
