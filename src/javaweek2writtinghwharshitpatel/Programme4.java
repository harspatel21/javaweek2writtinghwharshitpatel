package javaweek2writtinghwharshitpatel;

/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Programme4 {
    //4.1 Decalre two instance and stwo static variables
    //instance variable
    String Name = "Prime";
    String Surname = "Testing";
    //static variable
    static boolean a = true;
    static boolean b = false;

    //4.2 Declare one instance method
    //4.3 call all four instance and static variables into both instance and static methods inside the print statement.
    public void instanceMethod() {
        System.out.println(Name);
        System.out.println(Surname);
        System.out.println(Programme4.a);
        System.out.println(Programme4.b);
    }

    //4.4 Declare one static method.
    //4.5 CAll all four instance and static variables into both instance and static mehtods inside the print statement.
    public static void staticMethod() {
        Programme4 programme4 = new Programme4();
        System.out.println(programme4.Name);
        System.out.println(programme4.Surname);
        System.out.println(a);
        System.out.println(b);
    }

    // 4.6 Declare the main method.
    //4.7 Call both instance and static into the main method and run the programme.
    public static void main(String[] args) {
        Programme4 programme4 = new Programme4();
        programme4.instanceMethod();
        staticMethod();
    }
}
