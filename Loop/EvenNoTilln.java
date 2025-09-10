// Print all even numbers till n.

import java.util.*;
public class EvenNoTilln {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for print all even number till n :");
        int n=sc.nextInt();

        for(int i =2;i<=n;i+=2){
            System.out.println(i);
        }
    }
}
