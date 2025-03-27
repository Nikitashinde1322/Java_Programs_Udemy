/*
 * expression
 */

import java.lang.*;
import java.util.*;


public class P_10 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int length , breadth , height;
        int totalarea , volume;

        System.out.println(" Enter length , breadth and height : ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        totalarea = 2 *(length * breadth + length * height + breadth * height);
        volume = length * breadth * height;

        System.out.println(" Totalarea is : " + totalarea);
        System.out.println(" volume is : " + volume);
    }    
}
