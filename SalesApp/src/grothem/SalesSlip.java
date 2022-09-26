package grothem;

import java.util.ArrayList;

public class SalesSlip {
	private ArrayList<SalesItem> object = new ArrayList<SalesItem>();
	private double sales;
	private int count = -1;
	private String table = "";

	public SalesSlip() {

	}

	public void add(SalesItem obj) {
		object.add(obj);
	}

	public String totalSales(SalesItem obj) {
		double cost = obj.getCost();
		sales += cost;
		String str = "$" + String.valueOf(sales);
		return str;

	}

	public String toString() {
		count++;

		table += object.get(count).getName() + " " + "$" + object.get(count).getCost() + " "
				+ object.get(count).getQuantity() + "\n";
		System.out.println(table);
		return table;
	}

}
