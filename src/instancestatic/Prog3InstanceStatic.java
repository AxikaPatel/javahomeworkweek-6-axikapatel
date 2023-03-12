package instancestatic;

       /**Write a Java programme using the following steps.
       3.1 Declare one instance and one static variable.
       3.2 Declare one instance method.
       3.3 Declare one static method.
       3.4 Call both instance and static variables into both instance and static methods inside the
        print statement.
      3.5 Declare the Main method.
      3.6 Call both instance and static methods into the Main method and run the programme**/

public class Prog3InstanceStatic
{
    int a = 20; //instance variable
    static int b = 30; // static variable

    public static void main(String [] args)
    {
        // calling static method
            var();

        //calling instance method
        Prog3InstanceStatic var2 = new Prog3InstanceStatic();
        var2.var1();
    }

    //static method
    public static void var()
    {
       System.out.println("Variable 2 = " + b); //30
    }

    //instance method
    public  void var1()
    {
        System.out.println("Variable 1 = " + a); // 20
    }
}
