public class Methods {
    // Public == 'This method can be called from outside the class'
    // static == 'A method that belongs to a class, instead of an object'
    // void == If not returning anything. Replace with 'int' if returning an int, etc
    // main() == Must always be at the start, similar to __init__()
    public static void main(String[] args) {
        greetUser("Franklin");
    }

    public static void greetUser(String name) {
        System.out.println("Hello " + name);
    }
}
