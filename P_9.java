/*
 * roots of quadratic equation
 */

 import java.lang.*;
import java.util.*;


public class P_9 
{
    public static void main(String args[])
    {
        int a , b , c;
        double r1 , r2;
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the values of a , b and c : ");
         a = sc.nextInt();
         b = sc.nextInt();
         c = sc.nextInt();
         
         r1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
         r2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);

         System.out.println(" Quadratic roots are : " + r1 + " " + r2);
    }
}
