import java.util.Arrays;

public class insersion_sort {
    public static void main(String[] args) {
        int []arr={5,3,4,1,2};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int []arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (arr[j-1]>arr[j]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
