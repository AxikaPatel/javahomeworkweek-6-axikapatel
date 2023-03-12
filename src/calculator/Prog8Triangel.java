package calculator;

/**Write a program to calculate the area of a triangle.**/

import java.util.Scanner;

public class Prog8Triangel
{
      public static void main(String[] args)
      {
          Scanner tri = new Scanner(System.in); // calling scanner
          System.out.println("Enter the Base = ");
          double b = tri.nextDouble();// store static values
          System.out.println("Enter the Height = ");
          double h = tri.nextDouble(); // store static values
          trian(b,h); // calling static method
          tri.close();
      }
      //static method
      public static void trian(double b , double h)
      {
          double area = (b * h)/2;
          System.out.println("Calculate the area of a Triangle = " + area);
      }
}
