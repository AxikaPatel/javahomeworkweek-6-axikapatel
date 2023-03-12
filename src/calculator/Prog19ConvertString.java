package calculator;
/**. Write a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 Output: the quick brown fox jumps over the lazy dog.**/

import java.util.Scanner;

public class Prog19ConvertString
{
    public static void main(String[] args)
    {
        String conv;
        Scanner str =new Scanner(System.in); // calling scanner
        System.out.println("Enter Upper case String = ");
        conv = str.nextLine(); // store memory
        String lower = conv.toLowerCase(); //convert lower case, using lowercase() method
        System.out.println("Lower Case String= " + lower);
        str.close();
    }
}
