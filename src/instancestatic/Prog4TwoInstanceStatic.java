package instancestatic;

/** Write a Java programme using the following steps.
 4.1 Declare two instance and two static variables.
 4.2 Declare one instance method.
 4.3 Declare one static method.
 4.4 Call all four instance and static variables into both instance and static methods inside the
 print statement.
 4.5 Declare the Main method.
 4.6 Call both instance and static methods into the Main method and run the programme.**/

public class Prog4TwoInstanceStatic
{
    //instance variable
    int a = 10;
    int b = 20;

    // static variable
    static int x = 30;
    static int y = 40;


    public static void main(String [] args)
    {
        //calling instance method
        Prog4TwoInstanceStatic obj1 = new Prog4TwoInstanceStatic();
        obj1.var1();

        // calling static method
        var();
    }

    //instance method
    public  void var1()
    {
        System.out.println("Variable 1 = " + a); // 10
        System.out.println("Variable 2 = " + b); // 20
    }

    //static method
    public static void var()
    {
        System.out.println("Variable 1 = " + x); //30
        System.out.println("Variable 2 = " + y); //40
    }
}
