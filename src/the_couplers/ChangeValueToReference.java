package the_couplers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Iterator;

public class ChangeValueToReference {
	static class Customer {
		private final String name;

		public Customer(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}

	final class CustomerRepository {
		private static Dictionary<String, Customer> instances = new Hashtable<String, Customer>();
		public static Customer getCustomer(String name) {
			if(instances.get(name)==null)
				instances.put(name, new Customer(name));
			return instances.get(name);
		}
	}

	class Order {
		// …
		private Customer customer;

		public String getCustomerName() {
			return customer.getName();
		}

		public void setCustomer(String customerName) {
			customer = CustomerRepository.getCustomer(customerName);
		}

		public Order(String customerName) {
			setCustomer(customerName);
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
