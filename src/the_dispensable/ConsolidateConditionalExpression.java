package the_dispensable;

public class ConsolidateConditionalExpression {
	class Payout {
		// ...

		public int seniority;
		public int monthsDisabled;
		public boolean isPartTime;
		private int lengthofservice;

		public double disabilityAmount() {
			if (seniority < 2) {
				return 0;
			}
			if (monthsDisabled > 12) {
				return 0;
			}
			if (isPartTime) {
				return 0;
			}
			// compute the disability amount
			// ...
			return 1;
		}

		private boolean onVacation() {
			return true;
		}

		public int lengthOfService() {
			return lengthofservice;
		}

		public double vacationAmount() {
			if (onVacation()) {
				if (lengthOfService() > 10) {
					return 1;
				}
			}
			return 0.5;
		}
	}
}
