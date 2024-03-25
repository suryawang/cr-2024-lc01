package the_couplers;

import java.sql.Date;

public class IntroduceForeignMethod {
	class Account {
		Date previousDate;

		double schedulePayment() {
			Date paymentDate = nextWeek(previousDate);

			// Issue a payment using paymentDate.
			// ...
			return 1;
		}

		public static Date nextWeek(Date date) {
			return new Date(date.getYear(), date.getMonth(), date.getDate() + 7);
		}
	}
}
