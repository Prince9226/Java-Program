// Write a function that calculates the Greatest Common Divisor of 2 numbers. 

import java.util.*;

public class GreatestCommonDivisor {

    public static int findGCD(int n1, int n2){
        while(n1 != n2){
            if(n1>n2){
                n1=n1-n2;
            }
            else{
                n2=n2-n1;
            }
        }
        return n2;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number for n1 : ");
        int n1 = sc.nextInt();

        System.out.println("Enter the number for n2 : ");
        int n2 = sc.nextInt();

        int gcd=findGCD(n1,n2);
        System.out.println("Greatest common devisor is : " + gcd);

        sc.close();
    }
    
}
