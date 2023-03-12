package calculator;
/**Write a Java program to print the sum (addition), multiply, subtract, divide and
 remainder of two numbers.
 Test Data:
 Input first number: 125
 Input second number: 24
 Expected Output :
 125 + 24 = 149
 125 - 24 = 101
 125 x 24 = 3000
 125 / 24 = 5
 125 mod 24 = 5 **/

import java.util.Scanner;
public class Prog18Result
{
    public static void main(String[] args)
    {
          Scanner res = new Scanner(System.in);
          System.out.println("Enter Number 1 = ");
          double n1 = res.nextDouble();
          System.out.println("Enter Number 2 = ");
          double n2 = res.nextDouble();
          operation(n1,n2);
          res.close();

    }
    public static void operation(double a, double b)
    {
        double result;
        System.out.println("---------------------------------------");
        System.out.println("Sum of two Number = " + (a + b));
        System.out.println("---------------------------------------");
        System.out.println("Substraction of two Number = " + (a - b));
        System.out.println("---------------------------------------");
        System.out.println("Multiplication of two Number = " + (a * b));
        System.out.println("---------------------------------------");
        System.out.println("Division of two Number = " + (a / b));
        System.out.println("---------------------------------------");
        System.out.println("Mod of two Number = " + (a % b));
    }
}
