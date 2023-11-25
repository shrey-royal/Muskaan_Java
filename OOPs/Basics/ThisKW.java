class IceCream {
    String name, brand, flavor;

    IceCream(String name, String brand, String flavor) {
        this.name = name;
        this.brand = brand;
        this.flavor = flavor;
    }

    void display() {
        System.out.println(name + " " + brand + " " + flavor);
    }
}


public class ThisKW {
    public static void main(String[] args) {
        IceCream iceCream[] = new IceCream[5];
        
        iceCream[0] = new IceCream("Cornetto", "Kwality Walls", "Chocolate");
        iceCream[1] = new IceCream("Magnum", "Kwality Walls", "Chocolate");
        iceCream[2] = new IceCream("ChocoChip", "Havmor", "Chocolate");
        iceCream[3] = new IceCream("ChocoMud", "Havmor", "Chocolate");
        iceCream[4] = new IceCream("BlackCurrent", "Havmor", "BlueBerry");

        for (int i = 0; i < 5; i++) {
            iceCream[i].display();
        }
    }
}

/*
this keyword is used to refer to the current object.

this keyword can be used to refer: 
    1. instance variable of current class
    2. constructor of current class
    3. method of current class
    4. passed as an argument in the method call
    5. passed as argument in the constructor call
    6. used to return the current class instance from the method

*/