package dome;

public class testDOME {

	public static void main(String[] args) {
		Database x = new Database();
		x.setItemNumber(20000);
		CD cd = new CD("Animals", "Awesome Song", 200, "Martin Garrix", 5);
		DVD dvd = new DVD("Jack Reacher", "Christopher Mcquirre", 500, 2, "Thrilling Mystery Action");
		PCGame game = new PCGame("Call Of Duty", "PG13", 800, "Activision");
		x.addItem(cd);
		x.addItem(dvd);
		x.addItem(game);
		x.printItems();
		cd.depreciate();
		System.out.println(cd.getValue());
		x.removeItem("Jack Reacher", 500);
	}

}
