class Student{
    static String college = "ABC college";      // shared by all college
    String name;

    Student(String n){
        name=n;

    }
    void display(){
        System.out.println(name + " - " + college);
    }
    
}
public class TEst{
    public static void main(String[] args) {
        Student s1=new Student("Ravi");
        Student s2=new Student("Prince");

        s1.display();
        s2.display();
    }
}
