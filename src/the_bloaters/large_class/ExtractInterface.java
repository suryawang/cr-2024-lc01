package the_bloaters.large_class;

public class ExtractInterface {
	class TimeSheet {
		public double charge(Employee employee, int days) {
			double base = employee.getRate() * days;
			if (employee.hasSpecialSkill()) {
				return base * 1.05;
			} else {
				return base;
			}
		}
	}

	class Employee {
		private int rate;
		private boolean hasSpecialSkill;
		private String name;
		private String department;

		public Employee(int rate, boolean hasSpecialSkill, String name, String department) {
			this.rate = rate;
			this.hasSpecialSkill = hasSpecialSkill;
			this.name = name;
			this.department = department;
		}

		public String getName() {
			return name;
		}

		public String getDepartment() {
			return department;
		}

		public int getRate() {
			return rate;
		}

		public boolean hasSpecialSkill() {
			return hasSpecialSkill;
		}
	}

	void test() {
		var e1 = new Employee(100, false, "Budi", "KM");
		var e2 = new Employee(90, true, "Andi", "IT");
		var ts = new TimeSheet();
		System.out.println(ts.charge(e1, 10));
		System.out.println(ts.charge(e2, 10));
	}

	public static void main(String[] args) {
		new ExtractInterface().test();
	}
}
