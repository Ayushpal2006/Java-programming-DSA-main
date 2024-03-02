
public class max_and_min_number {
    public static void main(String[] args) {
        int[] array = {5, 12, 9, 18, 3, 21};
        int max = array[0]; // Assume the first element is the maximum initially
        int min = array[0]; // Assume the first element is the minimum initially
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update maximum value
            }
            if (array[i] < min) {
                min = array[i]; // Update minimum value
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }


    }