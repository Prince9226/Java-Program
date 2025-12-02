// 6.	Write a Java program to demonstrate the use of static variable and static method. Create a counter that counts the number of objects created for a class.


class Counter {
    // Static variable shared by all objects
    static int count = 0;

    // Constructor
    Counter() {
        count++;   // Increase count whenever a new object is created
    }

    // Static method to display count
    static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }
}

public class sixtt {
    public static void main(String[] args) {

        // Creating objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Calling static method
        Counter.displayCount();
    }
}
