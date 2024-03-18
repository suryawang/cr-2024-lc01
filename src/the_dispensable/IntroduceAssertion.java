package the_dispensable;

public class IntroduceAssertion {
	double expenseLimit;
	final double NULL_EXPENSE = 0.00;
	Project primaryProject;

	class Project {
		double getMemberExpenseLimit() {
			return 1;
		}
	}

	double getExpenseLimit() {
		// should have either expense limit or a primary project
		return (expenseLimit != NULL_EXPENSE) ? expenseLimit : primaryProject.getMemberExpenseLimit();
	}

	public static void main(String[] args) {
		var a = new IntroduceAssertion();
		a.expenseLimit = 1;
		System.out.println(a.getExpenseLimit());
	}
}
