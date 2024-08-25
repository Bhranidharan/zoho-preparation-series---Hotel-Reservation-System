package hotel_reservation_system;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner an = new Scanner(System.in);

        System.out.println("Welcome to Hotel");

        HotelService service = new HotelServiceImpl();
        HotelController controller = new HotelController(service);

        boolean b = true;

        while (b) {
            System.out.println("1. Check available Rooms \n" +
                    "2. Book Room \n" +
                    "3. Check out Room \n" +
                    "4. View Booking Info \n" +
                    "5. Enter 5 to quit");
            int option = an.nextInt();

            switch (option) {
                case 1: {
                    controller.availableRooms();
                    break;
                }
                case 2: {
                    System.out.print("Enter Your Name: ");
                    String name = an.next();
                    
                    // Create a new instance of HotelModel for each booking
                    HotelModel model = new HotelModel();
                    model.setName(name);
                    controller.checkIn(model);
                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.print("Enter Room No: ");
                    int i = an.nextInt();
                    
                    // Create a new instance of HotelModel for checkout
                    HotelModel model = new HotelModel();
                    model.setRoomNo(i);
                    controller.checkOut(model);
                    System.out.println();
                    break;
                }
                case 4: {
                    controller.bookingDetails();
                    break;
                }
                case 5: {
                    b = false;
                    break;
                }
                default: {
                    System.out.println("Try Again");
                    break;
                }
            }
        }
        an.close();
    }
}
