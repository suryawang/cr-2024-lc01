package sale;

public class ProductPurchase {
	private Product product;
	private int count;
	private String supplier;
	private long price;
	
	public ProductPurchase(Product product, int count, String supplier, long price) {
		this.product = product;
		this.count = count;
		this.supplier = supplier;
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public int getCount() {
		return count;
	}

	public String getSupplier() {
		return supplier;
	}

	public long getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return String.format(
				"Product: %s, Count: %d, Supplier: %s, Total: %d",
				product.getName(), count, supplier, price);
	}
}
