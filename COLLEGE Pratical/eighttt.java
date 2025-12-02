//  8.	Write a Java program to demonstrate single and multilevel inheritance with examples.

// -------- Single Inheritance Example --------

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

// Child class (Single Inheritance)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}


// -------- Multilevel Inheritance Example --------

// Grandparent class
class Vehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }
}

// Parent class
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

// Child class (Multilevel Inheritance)
class SportsCar extends Car {
    void turbo() {
        System.out.println("SportsCar uses turbo boost!");
    }
}


// -------- Main Class --------
public class eighttt {
    public static void main(String[] args) {

        System.out.println("----- Single Inheritance Example -----");
        Dog d = new Dog();
        d.eat();    // inherited from Animal
        d.bark();   // Dog's own method

        System.out.println("\n----- Multilevel Inheritance Example -----");
        SportsCar sc = new SportsCar();
        sc.start();  // from Vehicle
        sc.drive();  // from Car
        sc.turbo();  // from SportsCar
    }
}
