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
		Assert.isTrue(expenseLimit != NULL_EXPENSE || primaryProject != null);
		return (expenseLimit != NULL_EXPENSE) ? expenseLimit : primaryProject.getMemberExpenseLimit();
	}

	public static void main(String[] args) {
		var a = new IntroduceAssertion();
		//a.expenseLimit = 1;
		System.out.println(a.getExpenseLimit());
	}

	public static class Assert {
		public static void isTrue(boolean value) {
			if (value != true)
				throw new AssertionError("Value is false.");
		}
	}
}
