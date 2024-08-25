package hotel_reservation_system;

public class HotelModel {
	
	private int id;
	private String name;
	private int roomNo;
	
	
	public HotelModel(int id, String name, int roomNo) {
		this.id = id;
		this.name = name;
		this.roomNo = roomNo;
	}
	
	public HotelModel() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	
	@Override
	public String toString() {
		return "HotelModel [id=" + id + ", name=" + name + ", roomNo=" + roomNo + "]";
	}
	
	

}
