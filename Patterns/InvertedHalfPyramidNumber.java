import java.util.*;
public class InvertedHalfPyramidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number print for Inverted Half Pyramid Number :");
        int num =sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}
