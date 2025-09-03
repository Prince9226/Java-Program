import java.util.*;
public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number print for froyds Triangle :");
        int num = sc.nextInt();
        int number=1;

        // outer loop
        for(int i = 1;i<=num;i++){

            // inner loop
            for(int j =1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
    

}
