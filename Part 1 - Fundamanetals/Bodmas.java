public class Bodmas {
    public static void main(String[] args) {
        int x = 10 + 3 * 2;
        System.out.println(x); // Result is 16. 3 * 2 = 6. 10 + 6 = 16. Not, 10 + 3 = 13, 13 * 2 = 36.

        int y = (10 + 3) * 2; // Brackets get to go first
        System.out.println(y); // Returns 36
    }
}
