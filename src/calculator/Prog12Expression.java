package calculator;
/** Write a Java program to compute the specified expressions and print the
 output.
 Test Data:
 ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 Expected Output : 2.138888888888889 **/

public class Prog12Expression
{
    public static void main(String[] args)
    {
        System.out.println("Specified Expression = (25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5) ");
        Prog12Expression obj1 = new Prog12Expression(); // calling instance method
        obj1.expression();
    }
   //instance method
    public void expression()
    {
        double result =((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)); //Expression
        System.out.println("Result = " + result);
    }
}
