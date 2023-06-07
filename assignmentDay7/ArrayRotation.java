package assignmentDay7;
import java.util.Arrays;
public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int positions = 2;

        System.out.println("Original array: " + Arrays.toString(array));
        rotateLeft(array, positions);
        System.out.println("Rotated array: " + Arrays.toString(array));
    }

    public static void rotateLeft(int[] array, int positions) {
        int length = array.length;
        positions = positions % length;

        reverseArray(array,0, positions - 1);
        reverseArray(array, positions, length - 1);
        reverseArray(array, 0, length - 1);
    }

    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}