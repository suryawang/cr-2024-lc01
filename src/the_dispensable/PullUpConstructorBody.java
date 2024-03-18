package the_dispensable;

public class PullUpConstructorBody {
	class Employee {
		private String name;
		private String id;

		public Employee(String name, String id) {
			this.name = name;
			this.id = id;
		}

		public String toString() {
			return id + ": " + name;
		}
	}

	class Manager extends Employee {
		private int grade;

		public Manager(String name, String id, int grade) {
			super(name, id);
			this.grade = grade;
		}

		public String toString() {
			return super.toString() + ",Grade: " + grade;
		}
	}

	class Staff extends Employee {
		public Staff(String name, String id, int deskNumber) {
			super(name, id);
			this.deskNumber = deskNumber;
		}

		private int deskNumber;

	}

	void test() {
		var santi = new Manager("Santi", "E001", 13);
		System.out.println(santi);
	}

	public static void main(String[] args) {
		new PullUpConstructorBody().test();
	}
}
