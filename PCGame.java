package dome;

public class PCGame extends Item {
	private String developer;
	public PCGame() {
		super();
		developer = "";
	}
	
	public PCGame(String name, String comment, double value, String developer) {
		super(name,comment,value);
		this.developer = developer;
	}
	
	public String getDeveloper() {
		return developer;
	}
	
	public void setDeveloper(String dev) {
		this.developer = dev;
	}
	
	public String toString() {
		String x = super.getName() + ", " + developer + ", R" + super.getValue() + ", " + ", " + super.getComment();
		return x;
	}
	public void depreciate() {
		double value = 0.8*super.getValue();
		super.setValue(value);
	}
}