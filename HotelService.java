package hotel_reservation_system;

import java.util.*;

public interface HotelService {
	
	public String checkIn(HotelModel model);
	
	public String availableRoom();
	
	public String checkOut(HotelModel model);
	
	public List<HotelModel> bookedRooms();
	

}
