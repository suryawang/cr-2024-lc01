package the_couplers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ChangeValueToReference {
	class Customer {
		private final String name;

		public Customer(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}

	class Order {
		// …
		private Customer customer;

		public String getCustomerName() {
			return customer.getName();
		}

		public void setCustomer(String customerName) {
			customer = new Customer(customerName);
		}

		public Order(String customerName) {
			customer = new Customer(customerName);
		}

		public Customer getCustomer() {
			return customer;
		}
	}

	// Some client code, which uses Order class.
	private static int numberOfOrdersFor(Collection orders, String customer) {
		int result = 0;
		Iterator iter = orders.iterator();
		while (iter.hasNext()) {
			Order each = (Order) iter.next();
			if (each.getCustomerName().equals(customer)) {
				result++;
			}
		}
		return result;
	}

	void test() {
		var o1 = new Order("Andy");
		var o2 = new Order("Andy");
		var o3 = new Order("Sally");
		var o4 = new Order("Sally");
		var o5 = new Order("Sally");
		var orders = new ArrayList<Order>();
		orders.add(o1);
		orders.add(o2);
		orders.add(o3);
		orders.add(o4);
		orders.add(o5);
		System.out.println(numberOfOrdersFor(orders, "Andy"));
		System.out.println(numberOfOrdersFor(orders, "Sally"));
		for (var o : orders)
			System.out.println(o.getCustomer() + "->" + o.getCustomerName());
	}

	public static void main(String a[]) {
		new ChangeValueToReference().test();
	}
}
