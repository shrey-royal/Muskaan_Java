class Vehicle {
    public void drive() {
        System.out.println("Vehicle is being driven.");
    } 
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is being driven.");
    }

    public void park() {
        System.out.println("Car is parked.");
    }
}

class Truck extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Truck is being driven.");
    }

    public void loadCargo() {
        System.out.println("Truck is loading cargo.");
    }
}

public class RT_poly {
    public static void main(String[] args) {
        //Upcasting
        Vehicle vehicle = new Car();
        vehicle.drive();
        // vehicle.park();

        //Downcasting
        Vehicle vehicle2 = new Truck(); //Upcasting

        Truck truck = (Truck) vehicle2; //Downcasting
        truck.drive();  
        truck.loadCargo();

        //instanceof operator (boolean type)
        System.out.println(vehicle instanceof Car);
        System.out.println(vehicle instanceof Vehicle);
        System.out.println(vehicle2 instanceof Truck);
        System.out.println(vehicle2 instanceof Car);
    }
}
/*
> Upcasting: Upcasting involves treating an object of a subclass as an object of a superclass. This is implicit and doesn't require explicit type casting.
> Downcasting: Downcasting involves explicitly converting an object of a super class to an object of a subclass.

Tasks:

Scenario 1: Vehicle Rental System
In a vehicle rental system, create a base class called "Vehicle" with a method called "rent" that performs the rental process. Implement derived classes like "Car" and "Motorcycle" that override the "rent" method with their specific rental processes.

Scenario 2: Shape Drawing Application
In a shape drawing application, define a base class called "Shape" with a method called "draw" that displays the shape on the screen. Implement derived classes like "Circle" and "Rectangle" that override the "draw" method with their specific drawing logic.

*/