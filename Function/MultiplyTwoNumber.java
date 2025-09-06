import java.util.*;

public class MultiplyTwoNumber {
    public static int calculateMultiply(int a,int b){
        int multiply=a*b;
        return multiply;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number for multiplication :");
        int a=sc.nextInt();
        System.out.print("Enter the second number for multiplication :");
        int b=sc.nextInt();

        int multiply=calculateMultiply(a, b);
        System.out.print("Total Multiplication here :" +multiply);
    }
}
