class Bank {
    int getRateofInterest() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    int getRateofInterest() {
        return 8;
    }
}

class ICICI extends Bank {
    @Override
    int getRateofInterest() {
        return 9;
    }
}

public class Method_Overriding {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();

        System.out.println("SBI Irate: " + s.getRateofInterest());
        System.out.println("ICICI Irate: " + i.getRateofInterest());
    }
}

/*
Methods with same names present in the parent as well as in the child class.

Rules for method overriding:

1. The method must have the same name as in the parent class.
2. The method must have the same parameter as in the parent class.
3. There must be an IS-A relationship.


Tasks:

Scenario 1: Shape Drawing Application
In a shape drawing application, create a base class called "Shape" with a method called "draw." Implement different derived classes such as "Circle," "Rectangle," and "Triangle" that override the "draw" method to display the respective shapes.

Scenario 2: Bank Account System
In a bank account system, have a base class called "Account" with a method called "calculateInterest." Implement derived classes like "SavingsAccount" and "CurrentAccount" that override the "calculateInterest" method to provide interest calculation specific to each account type.

Scenario 3: Shape Transformation Application
In a shape transformation application, create a base class called "Shape" with a method called "transform." Implement different derived classes such as "Circle," "Rectangle," and "Triangle" that override the "transform" method to perform shape-specific transformations.


*/