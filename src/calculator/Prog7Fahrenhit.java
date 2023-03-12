package calculator;

import java.util.Scanner;
/** Write a program to insert any temperature value in degree Fahrenheit and
         convert to degree Celsius ((F − 32) × 5/9 = 0°C). **/

public class Prog7Fahrenhit
{
    public static void main(String [] args)
    {
        Scanner degree = new Scanner(System.in); // Call Scanner
        System.out.println("Insert any temperature value in degree Fahrenheit = ");
        float f = degree.nextFloat(); //Short  value to variable
        Prog7Fahrenhit temp = new Prog7Fahrenhit(); //calling instance method
        temp.tempe(f);
        degree.close();
    }
   //instance method
    public void tempe(float f)
    {
        float celsius= ((f-32)* 5/9);
        System.out.println("Convert to degree Celsius = " + celsius + "c" );
    }
}
