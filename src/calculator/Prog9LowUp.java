package calculator;
/**  Write a program to convert the upper case to lower case **/
import java.util.Scanner;
public class Prog9LowUp
{
     public static void main(String[] args)
     {
       String upper;
       Scanner scanner =new Scanner(System.in); // calling scanner
       System.out.println("Enter Upper Case Letter = ");
       upper = scanner.nextLine(); // store memory
       String lower = upper.toLowerCase(); //convert lower case, using lowercase() method
       System.out.println("Lower Case Letter= " + lower);

       scanner.close();

     }

}
