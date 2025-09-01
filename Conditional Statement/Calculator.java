
/* Q-:Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	1 : + (Addition) a + b
    2 : - (Subtraction) a - b
    3 : * (Multiplication) a * b
    4 : / (Division) a / b
    5 : % (Modulo or remainder) a % b
    Calculate the result according to the operation given and display it to the user.
*/

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choose your number:");
        int n = sc.nextInt();

        System.out.println("Enter the number of a:");
        int a = sc.nextInt();
        System.out.println("Enter the number of b:");
        int b = sc.nextInt();

        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int modulo = a % b;
        switch (n) {
            case 1:
                System.out.println("Total Addition:" + addition);
                break;
            case 2:
                System.out.println("Total Subtraction :" + subtraction);
                break;
            case 3:
                System.out.println("Total Multiplication :" + multiplication);
                break;
            case 4:
                System.out.println("Total Division :" + division);
                break;
            case 5:
                System.out.println("Total remainder :" + modulo);
                break;
            default:
                System.out.println("Not Valid!");

        }
    }
}
