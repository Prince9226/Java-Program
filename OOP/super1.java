class A {
    public void print1(){
        System.out.println("Class A");
    }
}
class B extends A{
    public void print1(){
        System.out.println("Class B");
    }
}
public class super1 {
    public static void main(String[] args) {
        B obj=new B();
        obj.print1();
    }
    
}
