package the_dispensable;

public class PullUpConstructorBody {
	class Employee {
		// ...
		protected String name;
		protected String id;

		public String toString() {
			return id + ": " + name;
		}
	}

	class Manager extends Employee {
		// ...
		private int grade;

		public Manager(String name, String id, int grade) {
			this.name = name;
			this.id = id;
			this.grade = grade;
		}

		public String toString() {
			return super.toString() + ",Grade: " + grade;
		}
	}

	void test() {
		var santi = new Manager("Santi", "E001", 13);
		System.out.println(santi);
	}

	public static void main(String[] args) {
		new PullUpConstructorBody().test();
	}
}
