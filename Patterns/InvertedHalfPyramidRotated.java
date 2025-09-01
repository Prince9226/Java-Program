import java.util.*;
public class InvertedHalfPyramidRotated {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for Inverted hatlf pyramid Rotated by 180 deg:");
        int num =sc.nextInt();

        for(int i =1;i<=num;i++){
            
            // inner loop -> space
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }

            // inner loop -> * print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            } 
            System.out.println();
        }
            
   }    
}
