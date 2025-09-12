import java.util.*;
public class UserDefine {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("How many numbers do you want in the array? : ");
        int size=sc.nextInt();
        int numbers[]=new int[size];

        // input
        for(int i = 0;i<size;i++){
            System.out.print("Enter the number for array : ");
            numbers[i]=sc.nextInt();
        }

        // output
        for(int i = 0;i<size;i++){
            System.out.println(numbers[i]);
        }
    }
}
