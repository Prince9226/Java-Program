
class Smartphone {
    int price;      // instance variable   (object)
    String model;    // instance variable
    static String brand="SmartPhone";     // static variable (class variable)
    
    Smartphone(String m, int p) {
        model = m;
        price = p;
    }
    
    void display(){
        System.out.println(" Brand : " + brand + ", model : " + model + " ,Price : " + price);
    }  
}
public class UseSmatPhone {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("Galaxy S23", 70000);
        Smartphone s2 = new Smartphone("Galaxy A54", 30000);
        Smartphone s3 = new Smartphone("Galaxy M14", 15000);

        s1.display();
        s2.display();
        s3.display();

        System.out.println("Brand (accessed by class): " + Smartphone.brand);
    }
}
