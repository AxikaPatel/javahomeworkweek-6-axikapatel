package calculator;

import java.util.Scanner;
/** Write a program to enter any radius value of the circle and find out the
 area.(Formula of Area A=PI*r*r).**/

public class Prog6Radious
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Radius Value of the Circle : ");
        double  r = scanner.nextDouble();
        Prog6Radious obj1 = new Prog6Radious();
        obj1.radius(r);
        scanner.close();
    }

    public void radius(double r)
    {
       double area= Math.PI * r * r;
       System.out.println("Area = " +area);
    }
}
