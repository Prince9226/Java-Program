// 5.	Write a Java program to demonstrate the super keyword to access parent class variables and methods in a derived class.


// Parent class
class Parent {
    String message = "Message from Parent Class";

    void displayMessage() {
        System.out.println("Parent Method: Displaying Parent Message");
    }
}

// Child class
class Child extends Parent {
    String message = "Message from Child Class";

    void show() {
        System.out.println("Child Variable: " + message);
        
        // Accessing parent class variable using super
        System.out.println("Parent Variable using super: " + super.message);
        
        // Calling parent class method using super
        super.displayMessage();
    }
}

// Main class to test
public class fivethtt {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
