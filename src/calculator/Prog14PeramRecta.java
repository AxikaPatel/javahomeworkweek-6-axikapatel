package calculator;
/** 14. Write a Java program to print the area and perimeter of a rectangle.
 Test Data:
 Width = 5.5 Height = 8.5
 Expected Output:
 Area is 5.6 * 8.5 = 47.60
 Perimeter is 2 * (5.6 + 8.5) = 28.20 **/

import java.util.Scanner;
public class Prog14PeramRecta
{
    public static void main(String[] args)
    {
          Scanner rect = new Scanner(System.in); // call scanner
          System.out.println("Enter Width of Rectangle = ");
          double wi = rect.nextDouble(); //store memory
          System.out.println("Enter Height of Rectangle = ");
          double hi = rect.nextDouble();
          areper(wi, hi); //call static method
          rect.close();

    }
    //static method
    public static void areper(double w, double h)
    {
        double result = w * h;
        System.out.println("Area of Rectangle = " + result);

        double result1 = 2 * (w + h);
        System.out.println("Perimeter of Rectangle =" + result);
    }
}
