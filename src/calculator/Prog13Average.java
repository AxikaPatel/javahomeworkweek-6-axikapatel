package calculator;
/** Write a Java program that takes three numbers as input to calculate and
 print the average of the numbers **/

import java.util.Scanner;
public class Prog13Average
{
    public static void main(String[] args)
    {
       Scanner avg = new Scanner(System.in); // calling scanner
       System.out.println("Enter First Number = ");
        double a = avg.nextDouble(); //store values
        System.out.println("Enter Second Number = ");
        double b =avg.nextDouble();
        System.out.println("Enter Third Number = ");
        double c =avg.nextDouble();
        aveg(a,b,c); //calling static method
        avg.close();
    }
    //Static method
    public static void aveg(double  a, double  b, double c)
    {
        double result = ((a + b +c)/3); // Average formula
        System.out.println("Average of three number = " + result);
    }
}
