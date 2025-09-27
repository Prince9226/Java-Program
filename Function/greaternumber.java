//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;
public class greaternumber {
    public static int greatertwo(int a ,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        // input a
        System.out.print("Enter the number of a : ");
        int a=sc.nextInt();

        // input b
        System.out.print("Enter the number of b :");
        int b = sc.nextInt();

        int greater=greatertwo(a, b);
        System.out.println(greater + " is greater");
        sc.close();

    }


}
