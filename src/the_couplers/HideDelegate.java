package the_couplers;

public class HideDelegate {
	class Person {
		private Department department;
		
		public Person getManager() {
			return department.getManager();
		}

		public void setDepartment(Department arg) {
			department = arg;
		}
	}

	class Department {
		private String chargeCode;
		private Person manager;

		public Department(Person manager) {
			this.manager = manager;
		}

		public Person getManager() {
			return manager;
		}

		// …
	}

	void test() {
		// Somewhere in client code
		Person john = new Person();
		Person sally = new Person();
		Department km = new Department(sally);
		john.setDepartment(km);
		Person manager = john.getManager();
		System.out.println(manager);
	}

	public static void main(String a[]) {
		new HideDelegate().test();
	}
}
