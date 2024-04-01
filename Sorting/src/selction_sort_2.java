import java.util.Arrays;

public class selction_sort_2 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            swap(arr,minIndex,i);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
