public class _287_findTheDuplicateNumber {
    public static void main(String[] args) {
        int []nums={1,2,3,3,4};
        int i = 0;
        while (i < nums.length) {
            int value = nums[i] - 1;  //range(1,N)
            if (nums[i] != nums[value]) {
                swap(nums, i, value);
            } else {
                i++;
            }
        }
        //find all disappered element ;

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                System.out.println(nums[index]);
            }
        }

    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
