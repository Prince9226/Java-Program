// Enter 3 numbers from the user & make a function to print their average.

import java.util.*;
public class Average {

    public static double calculate(int x,int y,int z){
        
        return (x+y+z)/3.0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of a: ");
        int x=sc.nextInt();
        System.out.print("Enter the number of a: ");
        int y=sc.nextInt();
        System.out.print("Enter the number of a: ");
        int z=sc.nextInt();

        double average=calculate(x, y, z);
        String formattedAverage = String.format("%.2f", average);

        System.out.println("Average of three number is:"+formattedAverage);
        sc.close();

    }
    
}
