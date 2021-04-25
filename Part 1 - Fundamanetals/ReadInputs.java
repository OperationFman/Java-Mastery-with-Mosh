import java.util.Scanner;

public class ReadInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = scanner.nextByte();
        System.out.println("You are " + age);
    }
}
