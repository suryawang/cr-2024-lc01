package the_couplers;

import java.sql.Date;

public class IncompleteLibraryClass {
	class Account {
		Date previousDate;

		double schedulePayment() {
			Date paymentDate = new MfDate(previousDate).nextWeek();

			// Issue a payment using paymentDate.
			// ...
			return 1;
		}

	}

	class MfDate extends Date {
		public MfDate(Date date) {
			super(date.getTime());
		}

		public Date nextWeek() {
			return new Date(getYear(), getMonth(), getDate() + 7);
		}
	}
}
