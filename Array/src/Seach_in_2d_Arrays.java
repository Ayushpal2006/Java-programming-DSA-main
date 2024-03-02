import java.util.Arrays;

public class Seach_in_2d_Arrays {
    public static void main(String[] args) {
        int arr[][]={{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        int element=10;
        System.out.print(Search_2d(arr,element));
    }

    static String Search_2d(int arr[][],int element){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col <arr[row].length; col++) {
                if(arr[row][col]==element){
                    return Arrays.toString(new int[]{row, col});
                }
            }
        }
        return Arrays.toString(new int[]{-1,-1});
    }
}
