package oo_abuser.switch_statement;

public class ReplaceParameterWithExplicitMethod {
	class Order {
		private int price;
		private int size;

		public Order(int price, int size) {
			this.price = price;
			this.size = size;
		}

		public int getPrice() {
			return price;
		}

		public int getSize() {
			return size;
		}

		// TODO:
		// change apply discount in this Fixed discount and Percent discount
		// with each own method

		public void applyFixedDiscount(double discount) {
			price -= discount;
		}

		public void applyPercentDiscount(double discount) {
			price *= discount;
		}
	}

	public void test() {
		Order order = new Order(20, 4);
		boolean weekend = false;
		if (weekend) {
			order.applyFixedDiscount(10);
		}
		if (order.getSize() > 5) {
			order.applyPercentDiscount(0.2);
		}
		System.out.println("price = " + order.getPrice());

		Order order1 = new Order(20, 7);
		boolean weekend1 = true;
		if (weekend1) {
			order1.applyFixedDiscount(10);
		}
		if (order1.getSize() > 5) {
			order1.applyPercentDiscount(0.2);
		}
		System.out.println("price = " + order1.getPrice());

		Order order2 = new Order(20, 7);
		boolean weekend2 = false;
		if (weekend2) {
			order2.applyFixedDiscount(10);
		}
		if (order2.getSize() > 5) {
			order2.applyPercentDiscount(0.2);
		}
		System.out.println("price = " + order2.getPrice());

	}

	public static void main(String[] args) {
		new ReplaceParameterWithExplicitMethod().test();
	}

}