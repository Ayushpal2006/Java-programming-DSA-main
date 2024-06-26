import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int []arr={4,2,5,3,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[]arr){
        int i=0;
        while(i< arr.length){
            int value=arr[i]-1;
            if (arr[i] !=arr[value]){
                swap(arr,i,value );
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
