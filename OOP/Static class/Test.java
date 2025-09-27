class Outer{
    static int data=30;
    static class Inner{
        void msg(){
            System.out.println("Data is :" + data);
        }
    }
}
public class Test{
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.msg();
    }
}