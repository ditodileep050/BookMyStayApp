---

## Use Case 2 – Basic Room Types & Static Availability

### Goal
Introduce object-oriented domain modeling using **abstraction and inheritance** before introducing complex data structures. This use case focuses on designing room types and representing availability using simple variables.

### Description
In this use case, different room types are modeled using an **abstract base class** and **concrete subclasses**. The system initializes predefined room types and displays their details along with their current availability.

Room availability is stored using simple variables to highlight the limitations of static state management. This prepares the system for future refactoring when dynamic inventory management and data structures are introduced.

---

### Key Concepts Used

**Abstract Class**

The `Room` class is defined as an abstract class representing the general concept of a hotel room.  
It contains common attributes such as:

- room type
- number of beds
- room size
- price

The abstract class ensures a common structure for all room types.

**Inheritance**

Specific room types extend the `Room` class:

- `SingleRoom`
- `DoubleRoom`
- `SuiteRoom`

Each subclass inherits common properties while representing a specialized room category.

**Polymorphism**

Room objects are referenced using the `Room` type, allowing different room implementations to be handled uniformly.

Example:

```
Room singleRoom = new SingleRoom();
Room doubleRoom = new DoubleRoom();
Room suiteRoom = new SuiteRoom();
```

**Encapsulation**

Room attributes are kept private and accessed using getter methods.  
This protects the internal state of the room objects.

**Static Availability Representation**

Room availability is stored using simple integer variables.

Example:

```
int singleRoomAvailable = 5;
int doubleRoomAvailable = 3;
int suiteRoomAvailable = 2;
```

This demonstrates a basic way of tracking availability before introducing more advanced data structures.

---

### Program Flow

1. User runs the application.
2. Room objects for different room types are created.
3. Availability values are assigned to each room type.
4. Room details and availability are printed to the console.
5. Application terminates.

---

### Files Implemented

```
Room.java
SingleRoom.java
DoubleRoom.java
SuiteRoom.java
UseCase2RoomInitialization.java
```

---

### How to Compile

```
javac UseCase2RoomInitialization.java
```

### How to Run

```
java UseCase2RoomInitialization
```

---

### Expected Output

```
BOOK MY STAY APPLICATION
Hotel Booking System v2.0

----- Single Room -----
Room Type: Single Room
Beds: 1
Size: 200 sq ft
Price: ₹2500
Available: 5

----- Double Room -----
Room Type: Double Room
Beds: 2
Size: 350 sq ft
Price: ₹4000
Available: 3

----- Suite Room -----
Room Type: Suite Room
Beds: 3
Size: 500 sq ft
Price: ₹8000
Available: 2
```
