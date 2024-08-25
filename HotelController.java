package hotel_reservation_system;

import java.io.*;
import java.util.*;

public class HotelController {
	
	private HotelService hotelService;
	
	HotelController(HotelService hotelService){
		this.hotelService = hotelService;
	}
	
	PrintWriter pr = new PrintWriter(System.out, true);
	
	public void checkIn(HotelModel model) {
		String s = hotelService.checkIn(model);
		pr.println(s);
	}
	
	public void checkOut(HotelModel model) {
		String s = hotelService.checkOut(model);
		pr.println(s);
	}
	
	public void availableRooms() {
		String s = hotelService.availableRoom();
		pr.println(s);
	}
	
	public void bookingDetails() {
		List<HotelModel> list = hotelService.bookedRooms();
		
		list.stream().forEach(h -> {
			pr.println("Room no: "+h.getRoomNo());
			pr.println("Nome : "+h.getName());
		});
	}

}
