/* Make a function to check if a number is prime or not. */

import java.util.*;

public class CheckPrime {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check it is Prime or Not : ");
        int num = sc.nextInt();

        if(isPrime(num)){
            System.out.println(num + " is a prime number.");
        }
        else{
            System.out.println(num + " is not a prime number.");
            sc.close();
        }
    }
}
