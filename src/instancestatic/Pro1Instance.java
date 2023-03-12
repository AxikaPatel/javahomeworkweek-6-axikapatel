package instancestatic;

/**Write a Java programme using the following steps.
 *1.1 Declare two instance variables.
 *1.2 Declare one instance method.
 *1.3 Call both instance variables into the instance method inside the print statement.
 *1.4 Declare the Main method.
 *1.5 Call the above instance method into the Main method and Run the programme.**/

public class Pro1Instance
{
    //instance variables
    int a = 20;
    int b = 30;
    public static void main(String[] args)
    {
        //calling method
           Pro1Instance var = new Pro1Instance();
           var.myMethod();
    }
   // instance method
    public void myMethod()
    {
        System.out.println("Variable = " + a); //20
        System.out.println("Variable = " + b); //30
    }
}
