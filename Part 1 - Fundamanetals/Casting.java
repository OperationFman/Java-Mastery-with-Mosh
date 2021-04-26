public class Casting {
    public static void main(String[] args) {
        // Casting is when a type is converted, in java this CAN be done automatically
        // eg. byte > short > int > long > float > double
        // since each gets bigger with each step. But can't be made smaller

        // IMPLICIT CONVERSION
        double x = 1.1;
        double y = x + 2;
        System.out.println(y); // Returns 3.1 because int is automatically casted to a double. 1.1 can't be automatically casted to an int though


        // EXPLICIT CONVERSION
        double a = 1.1;
        int b = (int)a + 2; // Explicitly converting the type by prefixing (int) will remove the numbers after the decimal. aka data loss
        System.out.println(b); // Returns 3

        String j = "1";
        int k = Integer.parseInt(j) + 2; // To convert string to an above data type, use .parse<datatype>(string)
        System.out.println(k); // Returns 3
    }
}
