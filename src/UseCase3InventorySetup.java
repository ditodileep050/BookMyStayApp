/**
 * Use Case 3 – Centralized Room Inventory Management
 * Version 3.0
 *
 * Demonstrates the use of HashMap for centralized
 * inventory state management.
 */

public class UseCase3InventorySetup {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("     BOOK MY STAY APPLICATION    ");
        System.out.println("=================================");
        System.out.println("Hotel Booking System v3.0\n");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Display inventory
        inventory.displayInventory();

        System.out.println("\nChecking availability...");

        System.out.println("Single Room Available: "
                + inventory.getAvailability("Single Room"));

        System.out.println("Double Room Available: "
                + inventory.getAvailability("Double Room"));

        System.out.println("Suite Room Available: "
                + inventory.getAvailability("Suite Room"));

        System.out.println("\nUpdating inventory...");

        inventory.updateAvailability("Single Room", 4);

        System.out.println("\nUpdated Inventory:");
        inventory.displayInventory();

        System.out.println("\nApplication Terminated.");
    }
}