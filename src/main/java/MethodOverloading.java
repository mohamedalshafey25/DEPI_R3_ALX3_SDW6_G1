public class MethodOverloading {

    public static void main(String[] args) {
        // example for method overloading
        add(5, 10); // Calls the method with two integer parameters
        add(10, 20, 30); // Calls the method with three integer parameters
        add(10.5,20.5); // Calls the method with two double parameters
        add(10.5, 20.5, 30.5); // Calls the method with three double parameters
    }


    public static int add(int a, int b) {
        return a + b; // Adding two integers
    }
    public static int add(int a, int b, int c) {
        return a + b + c; // Adding two integers
    }
    public static double add(double a, double b) {
        return a + b; // Adding two doubles
        // validate the result

    }
    public static double add(double a, double b, double c) {
        return a + b + c; // Adding two doubles
    }
    public static String add(String a, String b) {
        return a + b; // Adding two strings
    }

}
