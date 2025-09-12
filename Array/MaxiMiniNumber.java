/* Find the maximum & minimum number in an array of integers */

import java.util.*;

public class MaxiMiniNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number do you want in array: ");
        int size = sc.nextInt();
        int number[] = new int[size];

        // Input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number: ");
            number[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;    // in start sabse smallest.
        int min = Integer.MAX_VALUE;    // in start sabse largest.
        
        // Output
        for (int i = 0; i < number.length; i++) {
            if(number[i]<min){
                min=number[i];

            }
            if(number[i]>max){
                max=number[i];
            }

        }
        System.out.println("Minimum number is: "+min);
        System.out.println("Maximum number is: "+ max);
    }
}
