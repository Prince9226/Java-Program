//  Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.
//Try to convert it into a function on your own.


import java.util.*;
public class FindPower{

    public static int calculatepower(int x, int n){
        int result=1;

        for(int i =1 ; i<=n;i++){
            result = result * x;
        }
        return result;

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for x : ");
        int x = sc.nextInt();
        
        System.out.println("Enter the number for n : ");
        int n = sc.nextInt();

        int Powerresult=calculatepower(x, n);
        System.out.println("x to the power of n is : " + Powerresult);

    }
}