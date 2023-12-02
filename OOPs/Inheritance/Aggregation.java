class Address {
    String city, state, country;
    int pincode;

    public Address(String city, String state, String country, int pincode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }
}

class Employee {
    int e_id;
    String e_name;
    Address address;    //aggregation occurs here

    public Employee(int id, String name, Address address) {
        this.e_id = id;
        this.e_name = name;
        this.address = address;
    } 

    void display() {
        System.out.println("Id: " + e_id + "\nName: " + e_name);
        System.out.println("City: " + address.city + "\nState: " + address.state + "\nCountry: " + address.country + "\nPincode: " + address.pincode);
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Address add = new Address("Ayodhya", "Uttar Pradesh", "India", 226001);
        Employee emp1 = new Employee(123, "Ramchandra", add);
        emp1.display();
    }
}

/*
Aggregation: 
If a class have an entity reference, it is known as Aggragation. Aggregation represents HAS-A relationship.

Consider a situation, Employee Object contains many info such as id, name, emailid, etc. It contains one more object named address, which contains its own info such as city, state, country, zipcode, etc.

> Employee has an entity reference address, so the relationship is Employee HAS-A address.

Tasks:

Scenario 1: Library Catalog System
Design a library catalog system where a library has multiple books. The library class contains a list of book objects, representing an aggregation relationship.

Classes:
1. Book:
    - Attributes:
        - 'title' (string): Title of the book.
        - 'author' (string): Author of the book.
        - 'isbn' (string): ISBN number of the book.
    - Methods:
        - 'get_details()': Method to retrieve book details.
   
2. Library:
    - Attributes:
        - 'name' (string): Name of the library.
        - 'books' (list of Book objects): List of books in the library.
    - Methods:
        - 'add_book(book)': Method to add a book to the library.
        - 'remove_book(book)': Method to remove a book from the library.
        - 'search_book(title)': Method to search for a book by title.

Test Cases:

> Create books
book1 = Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565")
book2 = Book("To Kill a Mockingbird", "Harper Lee", "9780061120084")
book3 = Book("1984", "George Orwell", "9780451524935")

> Create a library and add books
library = Library("Central Library")
library.add_book(book1)
library.add_book(book2)
library.add_book(book3)

> Test searching for a book
found_book = library.search_book("1984")
if found_book:
    print("Book found:", found_book.get_details())
else:
    print("Book not found.")

> Remove a book
library.remove_book(book2)

Scenario 2: University Department Management
Create a university department management system where a department consists of multiple faculty members. The department class contains a list of faculty objects, representing an aggregation relationship.

Classes:
1. Faculty:
    - Attributes:
        - 'name' (string): Name of the faculty member.
        - 'position' (string): Position of the faculty member.
        - 'department' (string): Department the faculty belongs to.
    - Methods:
        - 'get_details()': Method to retrieve faculty details.
   
2. Department:
    - Attributes:
        - 'name' (string): Name of the department.
        - 'faculty_members' (list of Faculty objects): List of faculty members in the department.
    - Methods:
        - 'add_faculty(member)': Method to add a faculty member to the department.
        - 'remove_faculty(member)': Method to remove a faculty member from the department.
        - 'search_faculty(name)': Method to search for a faculty member by name.

Test Cases:

> Create faculty members
faculty1 = Faculty("John Doe", "Professor", "Computer Science")
faculty2 = Faculty("Jane Smith", "Assistant Professor", "Computer Science")
faculty3 = Faculty("Alex Johnson", "Associate Professor", "Mathematics")

> Create a department and add faculty members
cs_department = Department("Computer Science")
cs_department.add_faculty(faculty1)
cs_department.add_faculty(faculty2)

math_department = Department("Mathematics")
math_department.add_faculty(faculty3)

> Test searching for a faculty member
found_faculty = cs_department.search_faculty("John Doe")
if found_faculty:
    print("Faculty found:", found_faculty.get_details())
else:
    print("Faculty not found.")

> Remove a faculty member
cs_department.remove_faculty(faculty2)


*/