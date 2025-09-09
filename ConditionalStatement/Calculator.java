/*Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
1 : + (Addition) a + b
2 : - (Subtraction) a - b
3 : * (Multiplication) a * b
4 : / (Division) a / b
5 : % (Modulo or remainder) a % b
Calculate the result according to the operation given and display it to the user.
 */

import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Chosse the number 1 for Addition : ,2 for Subtraction :,3 for Multiplication :,4 for Division :,5  for Module : ");
        int num=sc.nextInt();
        System.out.println("Enter the number for a: ");
        int a=sc.nextInt();
        System.out.println("Enter the number nfor b:");
        int b=sc.nextInt();

        int sum =a+b;
        int Subtraction=a-b;
        int Multiplication=a*b;
        int Division=a/b;
        int Module=a%b;

        switch(num){
            case 1:
                System.out.print("Addition of "+a + " and " +b+" is: " +sum);
                break;
            case 2:
                System.out.println("Subtraction of "+a + " and " +b+" is: " +Subtraction);
                break;
            case 3:
                System.out.println("Multiplication of "+a + " and " +b+" is: " +Multiplication);
                break ;
            case 4:
                System.out.println("Division of "+a + " and " +b+" is: " +Division);
                break;
            case 5:
                System.out.println("Remainder of "+a + " and " +b+" is: " +Module);
                break;
            default :
                System.out.println("Invalid Number");
                break;
            
        }
    }
}
