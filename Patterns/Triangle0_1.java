import java.util.*;
public class Triangle0_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for print triangle 0-1: ");
        int n=sc.nextInt();

        // outer loop
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0)    // even
                    System.out.print("1 ");
                else        // odd 
                    System.out.print("0 ");
            }
            System.err.println();

        }
    }
}
