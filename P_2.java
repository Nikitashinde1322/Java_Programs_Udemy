/*
 * addition of two numbers program
 */

 import java.lang.*;
 import java.util.*;

public class P_2 
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the value of a : ");
        float a = sc.nextFloat();

        System.out.println(" Enter the value of b : ");
        float b = sc.nextFloat();

        float c = a+b;
        System.out.println(" Addition is : " + c);
    }    
}
