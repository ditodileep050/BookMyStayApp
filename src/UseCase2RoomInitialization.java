/**
 * Use Case 2 - Basic Room Types & Static Availability
 * Version 2.0
 *
 * Demonstrates object modeling using abstraction,
 * inheritance, and polymorphism.
 */

public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     BOOK MY STAY APPLICATION    ");
        System.out.println("=================================");
        System.out.println("Hotel Booking System v2.0\n");

        // Creating room objects (Polymorphism)
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Static availability variables
        int singleRoomAvailable = 5;
        int doubleRoomAvailable = 3;
        int suiteRoomAvailable = 2;

        // Display details
        System.out.println("----- Single Room -----");
        singleRoom.displayRoomDetails();
        System.out.println("Available: " + singleRoomAvailable + "\n");

        System.out.println("----- Double Room -----");
        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleRoomAvailable + "\n");

        System.out.println("----- Suite Room -----");
        suiteRoom.displayRoomDetails();
        System.out.println("Available: " + suiteRoomAvailable + "\n");

        System.out.println("Application Terminated.");
    }
}