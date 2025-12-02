//  3.	Write a Java program that demonstrates constructor overloading in a Student class.

class Student {
    String name;
    int age;
    String course;

    // Constructor 1: Only name
    Student(String name) {
        this.name = name;
        this.age = 0;  // default
        this.course = "Not Assigned";
    }

    // Constructor 2: Name and age
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.course = "Not Assigned";
    }

    // Constructor 3: Name, age, and course
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("----------------------------");
    }
}

public class thirdtt {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob", 20);
        Student s3 = new Student("Charlie", 22, "Computer Science");

        s1.display();
        s2.display();
        s3.display();
    }
}
