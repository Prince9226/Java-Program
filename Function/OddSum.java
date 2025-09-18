// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;

public class OddSum {
    public static int countodd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int totalSum = countodd(num);

        // output

        System.out.println("The sum of all odd numbers up to " + num + " is: " + totalSum);
    }

}
