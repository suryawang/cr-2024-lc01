package encapsulation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EncapsulationSmell {

	public static void main(String[] args) {
		Hotel hotelSantika = new Hotel();
		hotelSantika.setHotelName("Hotel Santika Jakarta Barat");
		hotelSantika.setStar(5);

		Customer yangPesan = new Customer();
		yangPesan.setCustomerName("Andi Budi");
		yangPesan.setContactNo("6281222333444");
		yangPesan.setAddress("Kebon Jeruk");

		BookingHotel transaksiPemesanan = new BookingHotel("21-05-2016", yangPesan);
//		transaksiPemesanan.setReservedBy(yangPesan);
		transaksiPemesanan.setBookedHotel(hotelSantika);
		//transaksiPemesanan.BookingId = "HTLBKG2016052100001";
		transaksiPemesanan.setRatePerNight(550000);
//		transaksiPemesanan.setBookedDate(new Date("2016-05-21"));
//		transaksiPemesanan.setBookedDate("12-05-2016");
		var b = new Customer();
		b.setCustomerName("Budiono");
		transaksiPemesanan.setReservedBy(b);
//		transaksiPemesanan.ReservedBy.CustomerName = "Budiono";
		hotelSantika.setDescription("Description of " + hotelSantika.getHotelName() + " : Test");
		System.out.println(hotelSantika.getDescription());
//		hotelSantika.HotelId = "HOTEL000001";
//		System.out.println(hotelSantika.HotelId);
		System.out.println(hotelSantika.getId());
		System.out.println(transaksiPemesanan.getBookingId());
		System.out.println(transaksiPemesanan.getBookedDate());
		
		var hotelBinus = new Hotel("Binus Square", 5);
		System.out.println(hotelBinus.getId());
		var nb = new Customer("Budi");
		nb.setContactNo("62856785454");
		nb.setAddress("Kebon Jeruk no. 27");
		var book = new BookingHotel("20-05-2024", nb);
		System.out.println(book.getBookingId());
		System.out.println(book.getBookedDate());
		System.out.println(book.getReservedBy());
	}
}
