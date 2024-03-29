package the_dispensable;

public class ConsolidateConditionalExpression {
	class Payout {
		// ...

		public int seniority;
		public int monthsDisabled;
		public boolean isPartTime;
		private int lengthofservice;

		public double disabilityAmount() {
			if (isNotEligibleForDisability()) {
				return 0;
			}
			// compute the disability amount
			// ...
			return 1;
		}

		private boolean isNotEligibleForDisability() {
			return seniority < 2 || monthsDisabled > 12 || isPartTime;
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
