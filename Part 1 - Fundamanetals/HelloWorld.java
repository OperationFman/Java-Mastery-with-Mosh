import java.util.Date;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        //TYPES
        int age = 30;
        age = 35;
        int myAge = age;
        byte bitten = 30;
        long tooBig = 3999999999L; // Numbers (ints) get too big, make primitive 'long' and append L to the end to solve this
        float price = 10.99F;
        char letter = 'A';
        boolean eligible = true;
        System.out.println("Hello World");
        System.out.println(myAge);
        System.out.println(bitten);
        System.out.println(tooBig);
        System.out.println(price);
        System.out.println(letter);
        System.out.println(eligible);


        // DATE
        Date now = new Date();
        System.out.println(now);


        // STRINGS (ARE REFS)
        String message = "Hello World" + "!!"; // Short hand, this isnt a primitive. Strings are immutable
        System.out.println(message);
        System.out.println(message.endsWith("!!")); // true
        System.out.println(message.replace("!", "?")); // .replace does not modify the original string

        String escape = "Hello \"World\""; // How to get "" in a string
        String fileLocation = "c:\\Windows\\..."; // outputs: C:\Windows\...
        String newLine = "Hello\nWorld"; // outputs two a new line, use \t for a tab
        System.out.println(escape);
        System.out.println(fileLocation);
        System.out.println(newLine);



        // ARRAYS
        int[] numbers = new int[5]; // 5 specifies how large it is. Int arrays defaults all to false. String to empty strings and boolean arrays to false.
        numbers[0] = 1;
        numbers[1] = 2; // If inserting an item and it doesn't fit/exist it'll throw an exception
        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = { 2, 3, 5, 1, 4 };
        Arrays.sort(numbers2);
        System.out.println(numbers2.length);
        System.out.println(Arrays.toString(numbers2));

        int[][] matrix = new int[2][3];
        matrix[0][0] = 1;
        System.out.println(Arrays.deepToString(matrix));

        int[][] matrix2 = { { 1, 2, 3}, {4, 5, 6} }; // use to creat and fill list immedietely
        System.out.println(Arrays.deepToString(matrix2));



        // BODMAS
        int x = 10 + 3 * 2;
        System.out.println(x); // Result is 16. 3 * 2 = 6. 10 + 6 = 16. Not, 10 + 3 = 13, 13 * 2 = 36.

        int y = (10 + 3) * 2; // Brackets get to go first
        System.out.println(y); // Returns 36



        // DOUBLES/FLOATS
        int result = 10 / 3; // Returns 9, Java can only divide whole numbers.
        double result2 = (double)10 / (double)3; // Returns 3.33. Add (double) to convert to float
        System.out.println(result);
        System.out.println(result2);
    }
}