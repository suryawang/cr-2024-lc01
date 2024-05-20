package encapsulation;

import java.util.List;

public class Hotel extends HotelStar {
	private String HotelId;
	private String HotelName;
	private String Address;
	private List<String> RoomType;

	private static int num = 0;

	public Hotel() {
		HotelId = "HOTEL" + String.format("%06d", ++num);
	}
	public Hotel(String hotelName, int star) {
		setHotelName(hotelName);
		setStar(star);
		HotelId = "HOTEL" + String.format("%06d", ++num);
	}
	public String getId() {
		return HotelId;
	}

	public void setHotelName(String HotelName) {
		this.HotelName = HotelName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public List<String> getRoomType() {
		return RoomType;
	}

	public void setRoomType(List<String> roomType) {
		RoomType = roomType;
	}

	public String getHotelName() {
		return HotelName;
	}

}
