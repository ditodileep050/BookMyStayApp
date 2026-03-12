/**
 * Abstract Room class representing a generalized room type.
 * Defines common attributes shared by all rooms.
 */

public abstract class Room {

    private String roomType;
    private int numberOfBeds;
    private int size;
    private double price;

    public Room(String roomType, int numberOfBeds, int size, double price) {
        this.roomType = roomType;
        this.numberOfBeds = numberOfBeds;
        this.size = size;
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void displayRoomDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Size: " + size + " sq ft");
        System.out.println("Price: ₹" + price);
    }
}