# Book My Stay – Hotel Booking Management System

## Use Case 3: Centralized Room Inventory Management

### Version
3.0

### Goal
Introduce centralized inventory management by replacing scattered availability variables with a single data structure using **HashMap**.

---

## Key Concepts

### HashMap
A `HashMap<String, Integer>` is used to store:

```
Room Type → Available Room Count
```

Example:

```
Single Room → 5
Double Room → 3
Suite Room → 2
```

---

### O(1) Lookup

HashMap allows **constant time lookup** for retrieving room availability.

Example:

```
inventory.get("Single Room")
```

---

### Single Source of Truth

All availability information is stored in one centralized structure instead of scattered variables.

---

### Encapsulation

Inventory logic is handled inside the `RoomInventory` class.

Other classes interact through methods like:

```
getAvailability()
updateAvailability()
displayInventory()
```

---

## Files Implemented

```
RoomInventory.java
UseCase3InventorySetup.java
```

---

## Compile

```
javac UseCase3InventorySetup.java
```

## Run

```
java UseCase3InventorySetup
```

---

## Author

Dito Dileep  
B.Tech Computer Science – AI & Machine Learning  
SRM Institute of Science and Technology
