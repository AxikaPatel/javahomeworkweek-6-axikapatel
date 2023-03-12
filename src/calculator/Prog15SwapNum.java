package calculator;
/**. Write a Java program to swap two variables.**/
import java.util.Scanner;
public class Prog15SwapNum
{
    public static void main(String[] args)
    {

         Scanner sw = new Scanner(System.in); //calling sacnner
         System.out.println("Enter number1 = ");
         int n1 = sw.nextInt(); //store values in memory
         System.out.println("Enter number2 = ");
         int n2 = sw.nextInt();
         System.out.println("Before Swap number a and b = " + n1 + "," + n2);
         swap(n1,n2); // calling static method
         sw.close();
    }
    //static method
    public static void swap(int a ,int b)
    {
        //swapping logic
        int ab;
        ab = a ;
        a = b;
        b = ab;
       System.out.println("After Swap number  a and b = " + a + ","  + b);
    }
}
