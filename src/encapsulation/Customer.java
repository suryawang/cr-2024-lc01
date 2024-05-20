package encapsulation;

public class Customer {
	private String CustomerId;
	private String CustomerName;
	private String ContactNo;
	private String Address;

	private static int num = 0;

	public Customer() {
		this.CustomerId = "CST" + String.format("%06d", ++num);
	}

	public Customer(String name) {
		setCustomerName(name);
		this.CustomerId = "CST" + String.format("%06d", ++num);
	}

	public String getCustomerId() {
		return CustomerId;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getContactNo() {
		return ContactNo;
	}

	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String toString() {
		return CustomerId + " - " + CustomerName + "[" + ContactNo + "]: " + Address;
	}
}
