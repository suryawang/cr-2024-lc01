package oo_abuser.refused_bequest;

public class ReplaceInheritenceWithDelegation {
	class Engine {
		// …
		private double fuel;
		private double CV;

		public double getFuel() {
			return fuel;
		}

		public void setFuel(double fuel) {
			this.fuel = fuel;
		}

		public double getCV() {
			return CV;
		}

		public void setCV(double cv) {
			this.CV = cv;
		}
	}

	class Car extends Engine {
		// ...
		private String brand;
		private String model;

		public String getName() {
			return brand + " " + model + " (" + getCV() + "CV)";
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}
	}

	void test() {
		Car c = new Car();
		c.setModel("A001");
		c.setBrand("Audi");
		c.setFuel(95.1);
		System.out.println(String.format("Car %s %s, fuel %f\n", c.getModel(), c.getBrand(), c.getFuel()));
	}

	public static void main(String[] a) {
		new ReplaceInheritenceWithDelegation().test();
	}
}
