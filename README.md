# Book My Stay – Hotel Booking Management System

This project demonstrates the design and implementation of a **Hotel Booking Management System** using **Core Java** and fundamental data structures. The project is developed incrementally through multiple use cases to illustrate how real-world software systems are built step by step.

The system focuses on implementing **core logic and system behavior** rather than graphical interfaces. Each use case introduces a new concept that solves common software engineering challenges such as request handling, inventory consistency, and preventing double bookings.

---

## Project Objective

The goal of this project is to help learners understand:

- How Java applications start and execute
- How data structures are used in real-world systems
- How to structure scalable software projects
- How to manage versions using **Git and GitHub branches**

Each use case is implemented in a **separate Git branch**.

---

## Repository Structure

```
BookMyStayApp
│
├── src
│   └── UseCase1HotelBookingApp.java
│
├── README.md
│
└── .gitignore
```

---

## Branch Structure

Each use case is maintained as a separate branch.

```
main
│
├── usecase1
├── usecase2
├── usecase3
```

This approach demonstrates a **real-world development workflow using Git branching**.

---

## Technologies Used

- Core Java
- IntelliJ IDEA
- Git
- GitHub
- Command Line (javac, java)

---

## Use Case 1 – Application Entry & Welcome Message

### Goal

Establish a clear starting point for the Hotel Booking application by demonstrating how a Java program begins execution and prints output to the console.

### Key Concepts

- Java Class
- `main()` method
- `static` keyword
- Console output using `System.out.println()`
- JavaDoc documentation
- Program execution flow

### Expected Output

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

## How to Run the Program

### Compile

```
javac UseCase1HotelBookingApp.java
```

### Run

```
java UseCase1HotelBookingApp
```

---

## Author

**Dito Dileep**  
B.Tech Computer Science – AI & Machine Learning  
SRM Institute of Science and Technology

---

## Future Enhancements

- Room inventory management
- Booking queue system
- Prevent double booking
- User authentication
- Reservation history tracking
