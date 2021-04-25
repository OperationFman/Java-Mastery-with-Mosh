import java.util.Scanner;

public class ReadInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        byte age = scanner.nextByte(); // Just use .nextLine() for strings, if you dont you only get the first word (Called a token), line is what you're used to
        System.out.println("You are " + age);
    }
}
