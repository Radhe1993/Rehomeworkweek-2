package rehomework;

import java.util.Scanner;

/**
 * Write sa java program for a calculator with addition,subtraction,division,multiplication.
 * Methods all with parameter and use string concatenation methods.
 * (Note: Two static and Two instance methods.)
 */


public class Program5
{
    //static methods
    public static void addition(int a,int b)
    {
        int result = a+b;
        System.out.println("The addition of "+a+"and"+b+"is :"+result);
    }
    public static int subtraction(int a,int b)
    {
        return a-b;
    }
    //instance methods
    public void multiplication(int a,int b)
    {
        int result = a*b;
        System.out.println("The multiplication of "+a+"and"+b+"is :"+result);

    }
        public int division(int a,int b)
        {
            return a/b;

        }

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner ob = new Scanner(System.in);
        System.out.println("please enter first number :");
        int a = ob.nextInt();
        System.out.println("please enter the second number :");
        int b = ob.nextInt();
        addition(a,b);
        int sunResult = subtraction(a,b);
        System.out.println("The subtraction of "+a+"and"+b+"is :"+sunResult);
        Program5 obj = new Program5();
        obj.multiplication(a,b);
        int divResult = obj.division(a,b);
        System.out.println("The division of "+a+ "and "+b+"is :"+divResult);
        // closing the scanner object


    }

}
