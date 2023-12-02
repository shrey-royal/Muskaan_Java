class PaymentProcessor {
    public void processPayment(String creditCardNumber, double amount) {
        System.out.println("Processing credit card payment of $" + amount + " with card number " + creditCardNumber);
    }

    public void processPayment(String bankAccountNumber, String bankRoutingNumber, double amount) {
        System.out.println("Processing bank transfer of $" + amount + " from bank account " + bankAccountNumber + " with routing number " + bankRoutingNumber);
    }

    public void processPayment(double amount) {
        System.out.println("Processing cash payment of $" + amount);
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment("1234 5678 9012 3456", 100.0);
        processor.processPayment("987654321", "ABCDEF", 200.0);
        processor.processPayment(50.0);
    }
}

/*
Method_Overloading: It is when we use a method with same name in the same class but with different parameters.

> change in the number of paramters
> change in the data type.

Scenario 1: Calculator
In a calculator application, implement method overloading for the addition operation. Create multiple methods with different parameter types such as adding two integers, adding two doubles, and adding three integers.

Scenario 2: Messaging App
In a messaging application, implement method overloading for sending messages. Create different methods with different parameter combinations, such as sending a text message, sending an image message, and sending a video message.

Scenario 3: Payment Processing System
In a payment processing system, implement method overloading for processing payments. Create different methods with different parameter combinations, such as processing a credit card payment, processing a bank transfer, and processing a cash payment.

Scenario 4: Social Media Analytics
In a social media analytics system, implement method overloading for analyzing user engagement. Create different methods with different parameter types, such as analyzing engagement based on likes, analyzing engagement based on comments, and analyzing engagement based on shares.

*/