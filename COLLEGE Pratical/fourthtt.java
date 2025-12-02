// 4.	Write a Java program to demonstrate the use of this keyword to refer the current class variable
//  when local and instance variables have the same name.

class Demo {
    int number; // instance variable

    // Constructor
    Demo(int number) {
        this.number = number;  // 'this.number' refers to instance variable
    }

    void display() {
        System.out.println("Value of instance variable (number): " + number);
    }
}

public class fourthtt {
    public static void main(String[] args) {
        Demo obj = new Demo(50);
        obj.display();
    }
}
