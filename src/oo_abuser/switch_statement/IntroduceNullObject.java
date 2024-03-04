package oo_abuser.switch_statement;

public class IntroduceNullObject {
	class Company {
		// …
		private Customer customer;

		public Customer getCustomer() {
			return customer;
		}
	}

	class Customer {
		private String name;
		private PaymentHistory history;
		private BillingPlan plan;
		public String getName() {
			return name;
		}

		public BillingPlan getPlan() {
			return plan;
		}

		public PaymentHistory getHistory() {
			return history;
		}
	}

	class PaymentHistory {
		public int getWeeksDelinquentInLastYear() {
			return 0;
		}
	}
	public static class BillingPlan {
		private int plan;
		public static BillingPlan basic() {
			return new BillingPlan(1);
		}
		BillingPlan(){
			plan=0;
		}
		BillingPlan(int plan) {
			this.plan = plan;
		}
	}

	void test() {
		Company site = new Company();
		// Somewhere in client code
		Customer customer = site.getCustomer();
		String customerName;
		if (customer == null) {
			customerName = "N/A";
		} else {
			customerName = customer.getName();
		}

		// …
		BillingPlan plan;
		if (customer == null) {
			plan = BillingPlan.basic();
		} else {
			plan = customer.getPlan();
		}

		// …
		int weeksDelinquent;
		if (customer == null) {
			weeksDelinquent = 0;
		} else {
			weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
		}
		System.out.println("Done");
	}
	public static void main(String args[]) {
		new IntroduceNullObject().test();
	}
}
