//package ConditionalStatement;
import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for check adult or not adult:");
        int age =sc.nextInt();
        if (age >= 18) {
            System.out.println("This is an adult");
        } else {
            System.out.println("This is not an adult");
        }

    }
}
