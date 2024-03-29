package the_bloaters.large_class;

public class ExtractClass {
	// todo extract class TelephoneNumber from class Person
	class Person {
		private String name;
		private TelephoneNumber officeNumber = new TelephoneNumber();

		public String getName() {
			return name;
		}

		public String getTelephoneNumber() {
			return officeNumber.getTelephoneNumber();
		}

		public TelephoneNumber getOfficeNumber() {
			return officeNumber;
		}

		public void setOfficeNumber(TelephoneNumber number) {
			officeNumber = number;
		}
	}

	class TelephoneNumber {
		private String areaCode;
		private String number;

		public TelephoneNumber() {
		}

		public TelephoneNumber(String areaCode, String number) {
			this.areaCode = areaCode;
			this.number = number;
		}

		public String getTelephoneNumber() {
			return "(" + areaCode + ") " + number;
		}
	}
}