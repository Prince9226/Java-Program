/* Make a function to check if a given number n is even or not. */

import java.util.*;
public class CheckEven {
    public static boolean isEven(int n){
        if(n<1){
            return false;
        }
        for(int i =1;i<=n;i++){
            if(n%2==0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check it is even or not : ");
        int num = sc.nextInt();
        System.out.println(isEven(num));
        sc.close(); 
    }
    


}
