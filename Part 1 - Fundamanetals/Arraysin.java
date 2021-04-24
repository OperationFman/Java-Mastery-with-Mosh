import java.util.Arrays;

public class Arraysin {
    public static void main(String[] args) {
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
    }   
}
