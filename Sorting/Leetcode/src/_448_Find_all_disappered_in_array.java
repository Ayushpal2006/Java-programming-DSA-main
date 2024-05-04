import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class _448_Find_all_disappered_in_array {
    public static void main(String[] args) {

        int []nums={4,3,2,7,8,2,3,1};

        int i = 0;
        while (i <nums.length) {
            int value = nums[i] - 1;  //range(1,N)
            if (nums[i] != nums[value]) {
                swap(nums, i, value);
            } else {
                i++;
            }
        }
        //find all disappered element ;

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }

        int[] intArray = new int[ans.size()];
        for (int j = 0; j < ans.size(); j++) {
            intArray[j] = ans.get(j);
        }
        System.out.println(ans);
        System.out.println(Arrays.toString(intArray));
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}