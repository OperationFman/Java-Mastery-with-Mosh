import java.util.Arrays;

public class Arraysin {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // 5 specifies how large it is
        numbers[0] = 1;
        numbers[1] = 2; // If inserting an item and it doesn't fit/exist it'll throw an exception
        System.out.println(Arrays.toString(numbers));
    }   
}
