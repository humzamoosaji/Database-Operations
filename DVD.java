package dome;

public class DVD extends Item{
	private String director;
	private int runningTime;
	public DVD() {
		super();
		director = "";
		runningTime = 0;
	}
	public DVD(String name, String director, double value, int runningTime, String comment) {
		super(name,comment,value);
		this.director = director;
		this.runningTime = runningTime;
	}
	
	public String getDirector() {
		return director;
	}
	public int getRunningTime() {
		return runningTime;
	}
	
	public void setDirector(String artist) {
		this.director = artist;
	}
	public void setRunningTime(int playingTime) {
		this.runningTime = playingTime;
	}
	
	public String toString() {
		String x = super.getName() + ", " + director + ", R" + super.getValue() + ", " + runningTime + ", " + super.getComment();
		return x;
	}
	public void depreciate() {
		double value = 0.85*super.getValue();
		super.setValue(value);
	}
}
