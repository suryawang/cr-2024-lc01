import java.util.Scanner;

import sale.Product;
import sale.ProductPurchase;

public class Hello {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product pen = new Product(1,"pen","blue",1000);
		int count;
		long total;
		String supplier;
		
		System.out.println("Input pen purchase:");
		System.out.print("Supplier: ");
		supplier = scan.nextLine();
		
		System.out.print("Count: ");
		count = scan.nextInt();
		
		System.out.print("Total Price: ");
		total = scan.nextLong();
		
		var purchase = 
				new ProductPurchase(pen, count, supplier, total);
		System.out.println(purchase);
		
	}
	
	
}
/*
class M { }
class A extends M{void method(){}}
class B extends M{void method(){}}

M v = new A();
//v.method();
if(v instanceof A) {
	((A)v).method();
} else if(v instanceof B) {
	((B)v).method();
}
*/