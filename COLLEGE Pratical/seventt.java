// 7.	Write a Java program to demonstrate method overloading with different parameter types.

 
class OverloadDemo {

    // Method 1: takes an int
    void show(int x) {
        System.out.println("Integer value: " + x);
    }

    // Method 2: takes a double
    void show(double x) {
        System.out.println("Double value: " + x);
    }

    // Method 3: takes a String
    void show(String s) {
        System.out.println("String value: " + s);
    }
}

public class seventt {
    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();

        obj.show(10);         // int version
        obj.show(12.5);       // double version
        obj.show("Hello");    // String version
    }
}
