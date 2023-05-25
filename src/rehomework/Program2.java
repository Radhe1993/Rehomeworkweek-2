package rehomework;

/**
 * Write a java Program using following method .
 * 2.1 Declare two static variable
 * 2.2 Declare one static method
 * 2.3 Call both static variable into the static method inside the class
 * 2.4 Declare the Main method .
 * 2.5 Call the static method into the main method and Run the Program
 */

public class Program2
{
    //2.1 Declare two static variables
    static int a = 100;
    static int b = 200;
    // 2.2 Declare one static method
    // 2.3 Call both static variable into the static method inside the print statement
    public static void staticMethod()
    {
        System.out.println(a);
        System.out.println(b);
    }
    // 2.4 Declare the Main method.
    // 2.5 Call the static method into the Main method and Run the class
    public static void main(String[] args) {
        staticMethod();
    }

}
