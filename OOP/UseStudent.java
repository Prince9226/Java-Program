class Student{      // Entity class
    int roll;       // Data member
    String name;
    double per;
}
class UseStudent{
    public static void main(String[] args) {
        Student s;
        s=new Student();
        s.roll=101;
        s.name="Prince";
        s.per=23.5;

        System.out.println("Roll"+s.roll);
        System.out.println("Name"+s.name);
        System.out.println("Per"+s.per);

    }
}
