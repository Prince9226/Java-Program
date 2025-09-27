// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
public class Radius {
    public static Double findradius(Double radius){
        return 2 * 3.14 *radius;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Double r=sc.nextDouble();

        System.out.println(findradius(r));
        sc.close();
    }
}
