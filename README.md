# Book My Stay – Hotel Booking Management System

## Use Case 1: Application Entry & Welcome Message

### Version
1.0

### Description
This use case demonstrates the **basic entry point of a Java application**.  
It establishes how the **Hotel Booking System starts execution** and prints a welcome message to the console.

The goal of this use case is to help understand how a Java program runs using the `main()` method and how console output can be used to observe application behavior.

---

## Objective

To create a simple Java application that:

- Starts execution using the `main()` method
- Prints the application name and version
- Displays a welcome message
- Terminates successfully

---

## Key Concepts Used

### Class
Every Java application must be defined inside a class.  
The class acts as the container for program behavior.

### main() Method
The `main()` method is the entry point of every Java program.

Signature:

```
public static void main(String[] args)
```

The JVM looks for this method to start program execution.

---

### static Keyword
The `main()` method is declared `static` so it can run **without creating an object** of the class.

---

### Console Output
The program uses:

```
System.out.println()
```

to display messages on the console.

---

### String Literals
Text enclosed in double quotes such as:

```
"Hotel Booking System v1.0"
```

is treated as a **String literal** in Java.

---

### Application Flow

1. User runs the program.
2. JVM calls the `main()` method.
3. The application prints a welcome message.
4. Program terminates.

---

## File Structure

```
src
└── UseCase1HotelBookingApp.java
```

---

## How to Compile

```
javac UseCase1HotelBookingApp.java
```

---

## How to Run

```
java UseCase1HotelBookingApp
```

---

## Expected Output

```
=================================
BOOK MY STAY APPLICATION
=================================
Hotel Booking System v1.0
Welcome to the Hotel Booking Management System!
Application Started Successfully.
Thank you for using Book My Stay.
```

---

## Author

Dito Dileep  
B.Tech Computer Science – AI & Machine Learning  
SRM Institute of Science and Technology
