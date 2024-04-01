public class First_Mising_positive {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int value = nums[i]-1;
            if (nums[i]>0 && nums[i] < nums.length && nums[i] != nums[value]) {
                swap(nums, i, value);
            } else {
                i++;
            }
        }
        //search First Missing Number;
        for (int index = 0; index <=nums.length; index++) {
            if (nums[index] != index+1) {
                return index+1;
            }
        }
        return nums.length+1;
    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
