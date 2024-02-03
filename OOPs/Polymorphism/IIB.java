class Bike {
    int speed;

    {   //this block will called before the Constructor
        //when object is created then the iib will be invoked
        speed = 200;
        System.out.println("IIB");
    }

    Bike() {
        System.out.println("speed is " + speed);
    }
}

public class IIB {
    public static void main(String[] args) {
        Bike b = new Bike();
        System.out.println(b.speed);
    }
}

/*
Instance Initializer Block:
syntax:
{
    //iib
}

Tasks:

Scenario 1: Employee Database
In an employee database system, create a class called "Employee" with an instance initializer block that initializes a static database connection. The block runs whenever an object of the "Employee" class is created.

Scenario 2: Game Initialization
In a game development scenario, have a class called "Game" with an instance initializer block that sets up the game environment, loads resources, and performs initialization tasks when a new game object is created.

Scenario 3: Online Game Initialization
In an online game development scenario, have a class called "Game" with an instance initializer block that sets up the game environment, loads resources, and performs initialization tasks when a new game object is created.

Scenario 4: Company Employee Management
In a company employee management system, create a class called "Employee" with an instance initializer block that initializes an employee's access privileges and permissions when a new employee object is created.

*/