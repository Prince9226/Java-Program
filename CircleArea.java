import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int r = sc.nextInt();

        final float PI=3.14f;
        float Area = PI*r*r;
        System.out.println("Area of Circle:" +Area);

    }
}
