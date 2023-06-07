package assignmentDay7;
public class Array {
    public static void main(String[] args) {
        int[] num = {200,50,60,12,9};
        int largest = num[0];
        int smallest = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
            if (num[i] < smallest) {
                smallest = num[i];
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}