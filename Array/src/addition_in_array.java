import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class addition_in_array {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int index = 2;
        int newValue = 10;

        // Shift the elements to the right to make room for the new element
        for (int i =index; i< myArray.length; i++) {
            myArray[i-1] = myArray[i];
        }

        // Insert the new element
//        myArray[index] = newValue;

        // Print the modified array
        System.out.println(Arrays.toString(myArray));
    }
}
