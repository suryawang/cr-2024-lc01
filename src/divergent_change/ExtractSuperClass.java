package divergent_change;

import java.util.Enumeration;
import java.util.Vector;

class Employee {
	private String name;
	private int annualCost;
	private String id;

	public Employee(String name, String id, int annualCost) {
		this.name = name;
		this.id = id;
		this.annualCost = annualCost;
	}

	public int getAnnualCost() {
		return annualCost;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}

class Department {
	private String name;
	private Vector<Employee> staff = new Vector<>();

	public Department(String name) {
		this.name = name;
	}

	public int getTotalAnnualCost() {
		int result = 0;
		for (Employee i : staff)
			result += i.getAnnualCost();
		return result;
	}

	public int getHeadCount() {
		return staff.size();
	}

	public Enumeration getStaff() {
		return staff.elements();
	}

	public void addStaff(Employee arg) {
		staff.addElement(arg);
	}

	public String getName() {
		return name;
	}
}