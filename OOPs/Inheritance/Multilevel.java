class Vehicle {
    String brand;
    
    void drive() {
        System.out.println("I drive " + brand + " car.");
    }
}

class Car extends Vehicle {
    String model;
    
    void displayDetails() {
        System.out.println("I drive " + brand + " " + model + " car.");
    } 
}   

class SportsCar extends Car {
    boolean turbo;

    void displayTurbo() {
        System.out.println("TurboCharged: " + turbo);
    }
}

public class Multilevel {
    public static void main(String[] args) {
        SportsCar car = new SportsCar();

        car.brand = "Ford";
        car.model = "Mustang GT";
        car.turbo = true;

        car.drive();
        car.displayDetails();
        car.displayTurbo();
    }
}

/*
Multilevel Inheritance: this type of inheritance have only one parent class then one child class and then another child class.

*/