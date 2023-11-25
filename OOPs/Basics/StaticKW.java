/*
class Student {
    int rollno;
    String name;
    static String college = "IIT";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

public class StaticKW {
    public static void main(String[] args) {
        Student s1 = new Student(1, "A");
        Student s2 = new Student(2, "B");
        
        s1.display();
        s2.display();
        
        // accessing static variable
        System.out.println(Student.college);
        System.out.println(s1.college);
        s1.college = "IIT Delhi";
        System.out.println(s2.college);
        s1.rollno = 420;
        s1.name = "C";
        s2.display();
    
    }
}

*/

/*
//static method

class Employee {
    int id;
    String name;
    static String company = "Google";

    Employee(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name + " " + company);
    }

    static void change() {
        company = "Microsoft";
    }

    static void changeCompany(String nameofCompany) {
        company = nameofCompany;
    }
}

public class StaticKW {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "A");
        Employee e2 = new Employee(2, "B");
        
        e1.display();
        e2.display();
        
        // accessing static variable
        // System.out.println(Employee.company);
        // System.out.println(e1.company);
        Employee.change();  // e1.change();
        System.out.println(e2.company);
        Employee.changeCompany("Amazon");
        e1.display();
        e2.display();
    
    }
}

*/

// static block: used to initialize the static data members. It is executed before the main method at the time of classloading.

class Student {
    int rollno;
    String name;
    static String college;

    Student(int r, String n) {
        System.out.println("Constructor called");
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    static {
        System.out.println("Static block called");
        college = "IIT Madras";
    }
}

class StaticKW {
    public static void main(String[] args) {
        Student s1 = new Student(1, "A");
        Student s2 = new Student(2, "B");
        
        s1.display();
        s2.display();
        
        // accessing static variable
        System.out.println(Student.college);
        System.out.println(s1.college);
        s1.college = "IIT Delhi";
        System.out.println(s2.college);
        s1.rollno = 420;
        s1.name = "C";
        s2.display();
    
    }
}



/*
Static Keyword:

> Static keyword is used to create variables and methods that will exist independently of any instance created for the class.

> Static Memory Allocation: Memory for static variables is allocated once when the class is loaded into the memory. (common memory allocation for all the objects) - compile time
> Static variables are initialized first, before the initialization of any instance variables.
> A single copy to be shared by all instances of the class.
> Static methods can be called without creating an object of the class.
> Static methods cannot access instance variables and instance methods directly.
> Before even constructors are called, static variables are initialized first and the static block is executed.

syntax:
    static data_type variable_name;
    static data_type variable_name = value;

    static return_type method_name() {
        // body
    }

    static return_type method_name(parameter_list) {
        // body
    }

    static {
        // body
    }


To access static variables and methods:
    ClassName.variable_name;
    ClassName.method_name();

Task:

Problem Statement: Car Fleet Management

You are tasked with developing a car fleet management system. The system needs to keep track of various pieces of information for each car in the fleet, such as the make, model, year, price, and whether the car is currently in use. Additionally, the system should maintain a count of the total number of cars in the fleet.

Design and implement a `Car` class to represent individual cars in the fleet. The `Car` class should have the following features:

- Attributes:
  - `make` (String): The make or brand of the car.
  - `model` (String): The model of the car.
  - `year` (int): The manufacturing year of the car.
  - `price` (double): The price of the car.
  - `isRunning` (boolean): A flag indicating whether the car is currently running or not.

- Static Attribute:
  - `numberOfCars` (int): A static variable to keep track of the total number of cars in the fleet.

- Methods:
  - A constructor to initialize the car's attributes.
  - `start()` and `stop()` methods to change the `isRunning` status.
  - `displayCarInfo()` method to display car information.
  - A `getNumberOfCars()` static method to retrieve the total number of cars in the fleet.

You need to implement the `Car` class and use it to create, manage, and display information for multiple cars in the fleet. Ensure that the `numberOfCars` variable is properly incremented when new cars are added to the fleet and that it can be accessed without creating an instance of the `Car` class.





*/