package dome;

public class Database {
	private Item[] item = new Item[1];
	
	public void setItemNumber(int i) {
		item = new Item[i];
	}
	int numItems = 0;
	
	public void addItem(Item a) {
		item[numItems] = a;
		numItems++;
	}
	
	public void removeItem(String name, int i) {
		for (int x = 0; x < item.length; x++) {
			if(item[x] != null) {
				if (item[x].getName().equalsIgnoreCase(name) && item[x].getValue() == i)
					item[x] = null;
			}
		}
	}
	
	public void printItems() {
		for (int x = 0; x < item.length; x++) {
			if(item[x] != null) {
				System.out.println(item[x].toString());
			}
		}
	}
	
	public void depreciate(Item a) {
		a.depreciate();
	}
}
