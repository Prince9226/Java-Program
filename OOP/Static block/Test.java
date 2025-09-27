class Demo{
    static int value;

    static{
        System.out.println("Static block executed!");
        value=100;
    }
}
public class Test{
    public static void main(String[] args) {
        System.out.println(Demo.value);   // static block runs before this
    }
}