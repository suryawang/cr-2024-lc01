package divergent_change;

import java.util.Enumeration;
import java.util.Vector;

abstract class Party {
	private String name;

	public Party(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	abstract int getAnnualCost();
}

class Employee extends Party {
	private int annualCost;
	private String id;

	public Employee(String name, String id, int annualCost) {
		super(name);
		this.id = id;
		this.annualCost = annualCost;
	}

	public int getAnnualCost() {
		return annualCost;
	}

	public String getId() {
		return id;
	}
}

class Department extends Party {
	private Vector<Employee> staff = new Vector<>();

	public Department(String name) {
		super(name);
	}

	public int getAnnualCost() {
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

}