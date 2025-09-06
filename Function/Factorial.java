import java.util.*;

public class Factorial {
    public static int printFactorial(int num) {
        if (num < 0) {
            System.out.println("Invalid Number!");
            return -1;
        }
        int factorial = 1;
        for (int i = num; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for find factorial:");
        int num = sc.nextInt();

        int factorial = printFactorial(num);
        if(factorial != -1){
            System.out.println("Factorial of "+ num +" is : " + factorial);
        }
    }

}
