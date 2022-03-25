package dome;

public class Item {
	private String name;
	private String comment;
	private double value;
	
	public Item(String name, String comment, double value) {
		this.name = name;
		this.comment = comment;
		this.value = value;
	}
	public Item() {
		name = "";
		comment = "";
		value = 0.0;
	}
	
	public String getName() {
		return name;
	}
	public String getComment() {
		return comment;
	}
	public double getValue() {
		return value;
	}
	
	public void setName(String x) {
		name = x;
	}
	public void setComment(String x) {
		comment = x;
	}
	public void setValue(double x) {
		value = x;
	}
	
	public String toString() {
		String x = name + ", R" + value + ", " + comment;
		return x;
	}
	void depreciate() {
		value = 0.95*value;
	}
}
