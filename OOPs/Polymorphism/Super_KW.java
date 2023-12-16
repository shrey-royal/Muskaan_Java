class Animal {
    String color = "white";
    
    Animal() {
        System.out.println("Default Animal Constructors");
    }
    
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    String color = "black";

    Dog() {
        super();    //first statement
        System.out.println("Dog class");
    }

    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
        super.eat();
    }
}


public class Super_KW {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}

/*
Super Keyword:
used to refer the immediate parent class' objects.

Scenario 1: Car Manufacturing
In a car manufacturing system, have a base class called "Vehicle" with a method called "manufacture" that handles common manufacturing steps. Implement a derived class called "Car" that overrides the "manufacture" method and uses the super keyword to invoke the base class implementation.

Scenario 2: Online Shopping
In an online shopping system, create a base class called "Product" with a method called "displayDetails" that shows general product information. Implement derived classes like "Electronics" and "Clothing" that override the "displayDetails" method and use the super keyword to display both general and specific product details.

Scenario 3: Vehicle Manufacturing
In a vehicle manufacturing system, have a base class called "Vehicle" with a method called "manufacture" that handles common manufacturing steps. Implement a derived class called "Car" that overrides the "manufacture" method and uses the super keyword to invoke the base class implementation.

Scenario 4: Online Retail System
In an online retail system, create a base class called "Product" with a method called "displayDetails" that shows general product information. Implement derived classes like "ElectronicsProduct" and "ClothingProduct" that override the "displayDetails" method and use the super keyword to display both general and specific product details.


*/