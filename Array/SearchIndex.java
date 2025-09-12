/* Take an array as input from the user. Search for a given number x and print the index
 at which it occurs.
 */

import java.util.*;

public class SearchIndex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number do you want in the array: ");
        int size = sc.nextInt();
        int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number for array: ");
            number[i] = sc.nextInt();

        }
        
        System.out.print("Enter the number for search index: ");
        int x = sc.nextInt();

        // output
        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.print("x found at index : " + i);
            }
        }

    }
}
