package rehomework;

/**
 * Write a java program using following steps
 * 4.1 Declare two instance and two static variable.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variable into both instance and static methods inside the print statement
 * 4.5 Declare the main method
 * Call both instance and static method into the Main method and run the programme.
 */

public class Program4
{
    // 4.1 Declare two instance and two static variable
    // instance variable
    String Name = "Prime";
    String Surname = "Testing";
    // static variable;
    static boolean a = true;
    static boolean b = false;
    // 4.2 Declare one instance method.
    // 4.4 CAll all fou instance nd static variable into both instance and static method inside the print statement
    public void instanceMethod(){
        System.out.println(Name);
        System.out.println(Surname);
        System.out.println(Program4.a);
        System.out.println(Program4.b);
    }
    // 4.3 Declare one static method .
    //4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
    public static void staticMethod() {
        Program4 programme_4 = new Program4();
        System.out.println(programme_4.Name);
        System.out.println(programme_4.Surname);
        System.out.println(a);
        System.out.println(b);
    }
    // 4.5 Declre the main mrthod.
    // 4.6 Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        Program4 program4 = new Program4();
        program4.instanceMethod();
        staticMethod();
    }
}
