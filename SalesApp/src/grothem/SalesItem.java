package grothem;

public class SalesItem {

	private String name;
	private double cost;
	private int quantity;

	public SalesItem(String n, String c, String q) {
		name = n;
		cost = Double.parseDouble(c);
		quantity = Integer.parseInt(q);
		// the total cost of buying multiple of an item
		cost = cost * quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		return name + " " + " " + cost + " " + quantity + " ";
	}

}
