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

public class SingleInheritance {
    public static void main(String[] args) {
        Car car = new Car();

        car.brand = "Ferrari";
        car.model = "1964 250 GT0";

        car.drive();
        car.displayDetails();
    }
}

/*
Single Inheritance: this type of inheritance have only one parent class and only one child class.

*/