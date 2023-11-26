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

class Motorcycle extends Vehicle {
    boolean hasSideCar;

    void sideCarInfo() {
        if(hasSideCar) {
            System.out.println("The Motorcycle has a sidecar.");
        } else {
            System.out.println("The Motorcycle doesn't have a sidecar.");
        }
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle bike = new Motorcycle();

        car.brand = "Ford";
        car.model = "Mustang GT";

        bike.brand = "Harley Davidson";
        bike.hasSideCar = false;

        car.drive();
        car.displayDetails();

        bike.drive();
        bike.sideCarInfo();
    }
}

/*
Hierarchical Inheritance: this type of inheritance have only one parent class and multiple child classes.

*/