public class StringClass {
    public static void main(String[] args) {
        StringBuffer sbuff = new StringBuffer();
        // System.out.println(sbuff.capacity());
        sbuff.append("this is a sample statement");
        // System.out.println(sbuff);
        // System.out.println(sbuff.capacity());
        // sbuff.ensureCapacity(10);
        // System.out.println(sbuff.capacity());
        // System.out.println(sbuff);

        // sbuff.insert(5, "new data ");
        // System.out.println(sbuff);
        // sbuff.delete(0, 5);
        // System.out.println(sbuff);
        sbuff.replace(0, 10, "3");
        System.out.println(sbuff);
        sbuff.reverse();
        System.out.println(sbuff);

    }
}

/*
StringBuffer class is used to create mutable string objects.
Thread Safe (multiple thread can't access it simultaneously)

default capacity: 16

append(String s)
insert(int offset, String s)
replace(int startindex, int endindex, String s)
delete(int startindex, int endindex)
reverse()
capacity() - new capacity will be allocated to the string acc. to ((oldCapacity*2) + 2)
ensureCapacity(int minimumCapacity)

*/

/*
Tasks:

1. Write a program to concatenate two strings using StringBuilder.
2. Implement a method to reverse a string using StringBuffer.
3. Create a function to append a character to a string using StringBuilder.
4. Write a program to convert a string to uppercase using StringBuffer.
5. Implement a function to insert a substring at the beginning of a string using StringBuilder.
6. Create a method to remove a character at a specific index from a string using StringBuffer.
7. Write a program to check if a string is empty using StringBuilder.
8. Implement a function to find the length of a string using StringBuffer.
9. Create a method to clear the contents of a StringBuilder object.
10. Write a program to check if two strings are equal using StringBuffer.

*/