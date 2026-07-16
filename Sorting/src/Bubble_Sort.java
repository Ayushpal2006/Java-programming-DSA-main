import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {

        int[] arr = {4, 7, 8, 2, 9, 6};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean isSorted = true;

            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    //perform swap
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }


    }
}
