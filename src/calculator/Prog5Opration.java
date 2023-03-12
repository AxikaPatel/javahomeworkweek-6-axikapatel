package calculator;

/**Write a program for a calculator with addition, subtraction, multiplication
 and division methods all with parameters and use string concatenation
 methods.(Note: Two static and Two instance methods.) **/

 public class Prog5Opration
{
    public static void main(String [] args)
    {
        //calling static method
        add( 10,20); //30
        sub(20,10);  //10

       //calling instance method
        Prog5Opration result = new Prog5Opration();
        result.mul(10,10); //100
        result.divd(10,5); //2
    }
    //static method
     public static void add(int a , int b)
     {
         int ans = a + b;
         System.out.println("Addition of two Number = " + ans );
         System.out.println("---------------------------------------------");
     }
    //static method
    public static void sub(int a , int b)
    {
        int ans = a - b;
        System.out.println("Subtraction of two Number = " + ans );
        System.out.println("---------------------------------------------");
    }
   //instance method
   public void mul(int a , int b)
   {
       int ans = a * b;
       System.out.println("Multiplication of two Number = " + ans );
       System.out.println("---------------------------------------------");
   }
   //instance method
    public void divd(int a , int b)
    {
        int ans = a / b;
        System.out.println("Division of two Number = " + ans );
        System.out.println("---------------------------------------------");
    }
}
