import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
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

        Date now = new Date();
        System.out.println(now);

        String message = "Hello World" + "!!"; // Short hand, this isnt a primitive
        System.out.println(message);
        System.out.println(message.endsWith("!!")); // true
    }
}