package hotel_reservation_system;

import java.util.*;

public class HotelServiceImpl implements HotelService{
	
	private static List<HotelModel> BookedInfo = new ArrayList<>();
    private static int totalRooms = 100;
    private static int alocatedRoom = 1;
    private static int id = 1;

	@Override
	public String checkIn(HotelModel model) {
		if(totalRooms == 0) {
			return "No Rooms Available";
		}
		model.setId(id++);
		model.setRoomNo(alocatedRoom++);
		totalRooms--;
		BookedInfo.add(model);
		return "Successfully Booked, Room no: "+ model.getId();
	}

	@Override
	public String availableRoom() {
		if(totalRooms == 0) {
			return "No Rooms Available";
		}
		return totalRooms+" are available";
	}

	@Override
	public String checkOut(HotelModel model) {
	    if (model.getRoomNo() <= 0) {
	        return "Room Number Should Be Greater Than Zero";
	    }

	    Optional<HotelModel> customerOpt = BookedInfo.stream()
	            .filter(c -> c.getRoomNo() == model.getRoomNo())
	            .findFirst();

	    if (!customerOpt.isPresent()) {
	        return "Room Not Found";
	    }

	    HotelModel customer = customerOpt.get();
	    totalRooms++;
	    BookedInfo.remove(customer);
	    return "Checked out Successfully from room: " + customer.getRoomNo();
	}


	@Override
	public List<HotelModel> bookedRooms() {
		return BookedInfo;
	}

}
