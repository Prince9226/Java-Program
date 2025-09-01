import java.util.*;
public class SolidRectangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for n:");
        int n=sc.nextInt();
        System.out.print("Enter the number for m:");
        int m = sc.nextInt();


        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}