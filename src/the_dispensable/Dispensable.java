package the_dispensable;

import java.util.Vector;
import java.util.Random;

public class Dispensable {
	public static void main(String[] a) {
		Master m = new Master();
		String[] names = { "Pencil HB", "Ballpoint Pen Red", "Ballpoint Pen Blue", "Ballpoint Pen Green" };
		Random rnd = new Random(0);
		Vector<SaleItem> items = new Vector<>();
		for (String n : names) {
			items.add(new SaleItem(n, rnd.nextInt(50), m.getPrice(n)));
		}
		for (SaleItem s : items) {
			System.out.println(new SaleItemMarkdownView(s));
			System.out.println(new SaleItemHtmlView(s));
		}
	}
}

class Master {
	final String[] names = { "Pencil HB", "Ballpoint Pen Red", "Ballpoint Pen Blue", "Ballpoint Pen Green" };
	final int[] values = { 120, 150, 145, 155 };

	public int getPrice(String name) {
		if (contain(name)) {
			for (int i = 0; i < names.length; i++)
				if (names[i].equals(name))
					return values[i];
		}
		return -1;
	}

	public boolean contain(String name) {
		for (String n : names)
			if (n.equals(name))
				return true;
		return false;
	}
}

class SaleItem {
	private int quantity;
	private int itemPrice;
	private String name;

	public SaleItem(String name, int quantity, int itemPrice) {
		this.name = name;
		this.quantity = quantity;
		this.itemPrice = itemPrice;
	}

	public String getName() {
		return this.name;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public int getItemPrice() {
		return this.itemPrice;
	}

	public double price() {
		final int basePrice = quantity * itemPrice;
		final double discount = Math.max(0, this.quantity - 500) * itemPrice * 0.05;
		final double shippingCost = Math.min(quantity * itemPrice * 0.1, 100.0);

		return basePrice - discount + shippingCost;
	}
}

abstract class SaleItemView {
	protected SaleItem item;

	public SaleItemView(SaleItem item) {
		this.item = item;
	}

	abstract String name();

	abstract String quantity();

	abstract String itemPrice();

	abstract String price();

	public String toString() {
		return name() + quantity() + itemPrice() + price();
	}
}

class SaleItemMarkdownView extends SaleItemView {
	public SaleItemMarkdownView(SaleItem item) {
		super(item);
	}

	String name() {
		return "#" + item.getName() + "\r\n";
	}

	String quantity() {
		return "> Quantity = " + item.getQuantity() + "\r\n";
	}

	String itemPrice() {
		return "> Price = " + item.getItemPrice() + "\r\n";
	}

	String price() {
		return "= " + item.price() + "\r\n";
	}
}

class SaleItemHtmlView extends SaleItemView {
	public SaleItemHtmlView(SaleItem item) {
		super(item);
	}

	String name() {
		return "<dl><dt>" + item.getName() + "</dt>";
	}

	String quantity() {
		return "<dd> Quantity = " + item.getQuantity() + "</dd>";
	}

	String itemPrice() {
		return "<dd> Price = " + item.getItemPrice() + "</dd>";
	}

	String price() {
		return "<dd> Total =" + item.price() + "</dd></dl>";
	}
}