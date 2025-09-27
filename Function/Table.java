// Make a function to print the table of a given number n

import java.util.*;
public class Table{
    public static int multitable(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num + " x " + i + " = " + num*i);
            
        }
        return num;
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for table find : ");
        int n =sc.nextInt();

        multitable(n);
        sc.close();
        
    }
}
